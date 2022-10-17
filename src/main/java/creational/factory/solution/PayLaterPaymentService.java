package creational.factory.solution;

public class PayLaterPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paid using Pay Later");
    }
}
