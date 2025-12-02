import Payment.Data.PaymentRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PaymentServiceTest {

    @Test
    void testGetPaymentByIdCallsRepository() {
        // Create a mock PaymentRepository
        PaymentRepository mockRepo = mock(PaymentRepository.class);

        // Inject the mock into PaymentService
        PaymentService service = new PaymentService(mockRepo);

        // Stub the return value for the mock
        Payment fakePayment = new Payment("P003", 200.0, "Card");
        when(mockRepo.getPaymentById("P003")).thenReturn(fakePayment);

        // Call the service method
        Payment result = service.getPaymentById("P003");

        // Assertions
        assertNotNull(result);
        assertEquals("P003", result.getPaymentId());

        // ⭐ REVIEW COMMENT FIXED:
        // Verify that repository.getPaymentById was actually called
        verify(mockRepo).getPaymentById("P003");
    }
}

