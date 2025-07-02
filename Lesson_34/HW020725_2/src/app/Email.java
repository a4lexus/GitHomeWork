package app;

import java.util.Scanner;

public class Email implements MailDeliveryService{

    @Override
    public void sendMail() {
        System.out.println("Отправить по интернету");
    }
}
