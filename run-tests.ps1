# run-tests.ps1 - compile MakeReservation sources and tests under src/test/java, then run JUnit tests
# Usage: Open PowerShell in project root and run: .\run-tests.ps1

$JUNIT = "lib\junit-4.13.2.jar"
$HAMCREST = "lib\hamcrest-core-1.3.jar"
$SRC = "MakeReservation"
$TESTSRC = "src\test\java"
$OUT = "out\test-classes"

New-Item -ItemType Directory -Force -Path $OUT | Out-Null

Write-Host "Looking for source files..."
$srcFiles = @()
if (Test-Path $SRC) { $srcFiles = Get-ChildItem -Path $SRC -Recurse -Filter *.java | ForEach-Object { $_.FullName } }

Write-Host "Looking for test files..."
$testFiles = @()
if (Test-Path $TESTSRC) { $testFiles = Get-ChildItem -Path $TESTSRC -Recurse -Filter *.java | ForEach-Object { $_.FullName } }

if (($srcFiles.Count -eq 0) -and ($testFiles.Count -eq 0)) {
    Write-Error "No Java source or test files found under $SRC and $TESTSRC"
    exit 1
}

$allFiles = $srcFiles + $testFiles

# Build classpath for compilation (quote as single string)
$cp = ".;$JUNIT;$HAMCREST"

Write-Host "Compiling $($allFiles.Count) files..."
& javac -cp $cp $allFiles -d $OUT
if ($LASTEXITCODE -ne 0) {
    Write-Error "Compilation failed with exit code $LASTEXITCODE"
    exit $LASTEXITCODE
}
Write-Host "Compilation succeeded. Classes written to $OUT"

# Discover test classes (derive fully-qualified names from package declarations)
$testClasses = @()
foreach ($tf in $testFiles) {
    $content = Get-Content $tf -ErrorAction SilentlyContinue
    $pkgLine = $content | Select-String -Pattern '^\s*package\s+([A-Za-z0-9_.]+)\s*;' -AllMatches
    if ($pkgLine.Matches.Count -gt 0) {
        $pkg = $pkgLine.Matches[0].Groups[1].Value
        $className = [System.IO.Path]::GetFileNameWithoutExtension($tf)
        $testClasses += "$pkg.$className"
    } else {
        $testClasses += [System.IO.Path]::GetFileNameWithoutExtension($tf)
    }
}

if ($testClasses.Count -eq 0) {
    Write-Host "No test classes found to run."
    exit 0
}

# Run each test class with JUnitCore
$runCp = ".;$OUT;$JUNIT;$HAMCREST"
foreach ($tc in $testClasses) {
    Write-Host "\nRunning tests in $tc"
    & java -cp $runCp org.junit.runner.JUnitCore $tc
    if ($LASTEXITCODE -ne 0) {
        Write-Error "Tests in $tc failed (exit $LASTEXITCODE)"
    }
}

Write-Host "All done."