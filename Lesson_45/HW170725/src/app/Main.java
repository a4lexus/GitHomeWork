package app;

import app.model.BankAccount;
import app.model.Person;
import app.service.PersonsService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static <bankAccountList> void main(String[] args) {

        List<BankAccount> bankAccountList = (List.of(
                new BankAccount(new Person("Вася","Васин",19,"vv@gmail.com"),
                      "DE123456", 1900.35),
                new BankAccount(new Person("Петя","Петин",22,"pp@hotmail.com"),
                      "FR987654",99.99),
                new BankAccount(new Person("Саша","Сашин",25,"ss@hotmail.com"),
                      "ES557799",10000.55),
                new BankAccount(new Person("Оля","Олина",21,"ll@hotmail.com"),
                      "DE111333",25009.45),
                new BankAccount(new Person("Таня","Танина",18,"tt@hotmail.com"),
                      "FR444888",23456.78),
                new BankAccount(new Person("Коля","Колин",29,"kk@hotmail.com"),
                      "IT666000",505678.99),
                new BankAccount(new Person("Дима","Димин",16,"dd@hotmail.com"),
                        "DE151515",55.95))

        );
        System.out.println("Исходный лист: ");
        PersonsService.print(bankAccountList);
        System.out.println("<=========================== balance < 100 ========================================>");

        List<BankAccount> list1 = bankAccountList.stream().filter(p -> p.getBalance() < 100).toList();
        PersonsService.print(list1);
        System.out.println("<========================== balance > 10000 =======================================>");

        List<BankAccount> list2 = bankAccountList.stream().filter(p -> p.getBalance() > 10000).toList();
        PersonsService.print(list2);
        System.out.println("<======================== List<Owner> < 21 year ===================================>");

        List<BankAccount> list3 = bankAccountList.stream().filter(p -> p.getOwner().getAge() < 21).toList();
        PersonsService.print(list3);
        System.out.println("<============ List<String> 'name,IBAN,email,balance>100000' ========================>");

        List<String> list4 = bankAccountList.stream().filter(p -> p.getBalance() >100000)
                .map(p -> {
                    String fullName = p.getOwner().getlName() + " " + p.getOwner().getfName().charAt(0) + ".";
                    String iban = p.getIBAN();
                    String email = p.getOwner().getEmail();
                    return fullName + ", IBAN: " + iban + ",email: " + email;
        })
                .collect(Collectors.toList());
        PersonsService.print(list4);
    }
}
/* задача 1.  Использование Stream
Дан список  BankAccount {Person owner, String IBAN, double balance).
Класс Person состоит из {String fName, String lName, int age, String email)
Используя stream необходимо получить List всех аккаунтов, баланс которых составляет менее 100.
Используя stream необходимо получить List<Person> всех владельцев счетов, баланс которых больше 10000
Используя stream необходимо получить List<BankAccount> владельцы которых младше 21
Используя stream,  сформировать лист строк вида “Lennon J.;IBAN: DE199988643;lennon@gmail.com”
 (т.е. ФИО; счет, email)  для всех клиентов, чей баланс более 100000
*/
