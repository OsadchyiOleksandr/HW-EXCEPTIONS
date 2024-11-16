В проєкті має бути реалізовано функціонал валідації достатності грошових коштів на рахунку при певній сумі покупки.

Приклад виведення при достатності коштів:

Balance is USD 1000,00.
Enter purchase amount, USD: 750
Funds are OK. Purchase paid.
Balance is USD 250,00

Приклад виведення при недостатності коштів:

Balance is USD 1000,00.
Enter purchase amount, USD: 1200
Insufficient funds!

(1) Cтворіть проект Funds-Validator на локальній машині через IntelliJ IDEA (IDE).

(2) Структура проєкту має бути такою:

(3) Доопрацюйте функціонал класу Main

package app;

import java.util.Scanner;

public class Main {

    static double balance;

    public static void main(String[] args) {
        balance =
        validateAmount(balance, getAmount());
    }

    private static double getBalance() {
        return 1000.00; // Наявні кошти на рахунку
    }

    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // Метод валідації наявних коштів
    private static void validateAmount(double balance, double withdrawal) {
        if (withdrawal > ) {
            try {
                throw new ("Insufficient funds!");
            } catch (FundsException ex) {
                System.out.println(.getMessage());
            }
        } else {
            balance = getBalance(balance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid." +
                    "%nBalance is USD %.2f", balance);
        }
    }

    // Метод розрахунку наявних коштів на рахунку
    // після зняття певної суми коштів
    private static double getBalance(double balance, double withdrawal) {
        return balance - ;
    }
}

(4) Доопрацюйте функціонал класу FundsException

package app;

// Кастомний виняток
public class FundsException extends  {

    public FundsException(String message) {
        super();
    }
}

(5) Залийте виконаний проєкт на свій GitHub репозиторій, посилання на який зазначте в LMS.

