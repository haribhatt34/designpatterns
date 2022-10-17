package creational.factory.solution;

public class CourierService {

    public void payment(String mode) {
        PaymentFactory factory = new PaymentFactory();
        PaymentService service = factory.getPaymentSerivce(mode);
        service.pay();
    }
}
