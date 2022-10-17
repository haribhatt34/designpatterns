package creational.factory.solution;

public class DebitCardPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paid using Debit Card");
    }
}
