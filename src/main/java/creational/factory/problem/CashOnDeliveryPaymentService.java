package creational.factory.problem;

public class CashOnDeliveryPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paid using Cash On Delivery");
    }
}
