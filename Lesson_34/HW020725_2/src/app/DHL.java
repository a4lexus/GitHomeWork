package app;

public class DHL implements MailDeliveryService{


    @Override
    public void sendMail() {
        System.out.println( "Положи письмо в конверт, приклей марку, отправь");
    }
}
