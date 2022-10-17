package creational.factory.problem;

public class CreditCardPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}
