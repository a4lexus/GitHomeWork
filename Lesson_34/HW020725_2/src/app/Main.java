package app;


import java.security.Provider;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();

        System.out.println("Введите [1]: DHL [2]: Email [3]: Pigeon : ");
        int i = scanner.nextInt();
        scanner.nextLine();

        MailDeliveryService service = null;
        switch (i) {
            case 1:service = new DHL();break;
            case 2:service = new Email();break;
            case 3:service = new Pigeon();break;
            default:
                System.out.println("Завершение программы");
                return;
        }
        sender.send(service);

        }
    }



