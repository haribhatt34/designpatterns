package creational.factory.problem;

public class UpiPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
