package creational.factory.problem;

public class CourierService {

    public void payment(String mode) {
        PaymentService service = null;
        if (mode == "debitCard") {
            service = new DebitCardPaymentService();
        } else if (mode == "creditCard") {
            service = new CreditCardPaymentService();
        } else if (mode == "upi") {
            service = new UpiPaymentService();
        } else if (mode == "cashOnDelivery") {
            service = new CashOnDeliveryPaymentService();
        } else if (mode == "payLater") {
            service = new PayLaterPaymentService();
        }

        service.pay();
    }
}
