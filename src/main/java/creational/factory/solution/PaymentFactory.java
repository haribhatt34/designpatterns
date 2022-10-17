package creational.factory.solution;

public class PaymentFactory {

    PaymentService getPaymentSerivce (String paymentMode) {
        if (paymentMode == "debitCard") {
            return new DebitCardPaymentService();
        } else if (paymentMode == "creditCard") {
            return new CreditCardPaymentService();
        } else if (paymentMode == "upi") {
            return new UpiPaymentService();
        } else if (paymentMode == "cashOnDelivery") {
            return new CashOnDeliveryPaymentService();
        } else if (paymentMode == "payLater") {
            return new PayLaterPaymentService();
        } else {
            return null;
        }
    }
}
