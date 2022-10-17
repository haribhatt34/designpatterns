package creational.factory.problem;

public class DebitCardPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paid using Debit Card");
    }
}
