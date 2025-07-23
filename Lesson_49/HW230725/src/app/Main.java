package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String email = askForValidEmail();
        System.out.println("Вы ввели Email: " + email);
    }
    public static String askForValidEmail() {
        Scanner scanner = new Scanner(System.in);
        String email;

        while (true) {
            System.out.print("Введите Email: ");
            email = scanner.nextLine();

            try {
                validateEmail(email);
                return email;
            } catch (NotCorrectEmailFormatException e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте ещё раз!!");
            }
        }
    }
    public static void validateEmail(String email) {
        if (email.length() < 5) {
            throw new NotCorrectEmailFormatException("Email должен быть не короче 5 символов!!");
        }
        int atIndex = email.indexOf("@");
        int lastAtIndex = email.lastIndexOf("@");

        if (atIndex == -1 || atIndex != lastAtIndex || atIndex == 0 || atIndex == email.length() - 1) {
            throw new NotCorrectEmailFormatException("Email должен иметь '@' и не быть первым или последним");

        }
    }
}



