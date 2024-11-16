package app;

import java.util.Scanner;

public class Main {

    static double balance;

    public static void main(String[] args){
        balance = 1000.00;
        validateAmount(balance, getAmount());
    }

    private static double getBalance() {
        return balance; // Наявні кошти на рахунку
    }

    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // Метод валідації наявних коштів
    private static void validateAmount(double balance, double withdrawal){
        try {
            if (withdrawal > balance) {
                throw new FundsException("Insufficient funds!");
            } else {
                balance = getBalance(balance, withdrawal);
                System.out.printf("Funds are OK. Purchase paid." +
                        "%nBalance is USD %.2f", balance);
            }
        } catch (FundsException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println("Un excepted behavior\nCheck logs");
            // Record to logs Logger.record(ex.stackTrace()) or some like this
        }
    }

    // Метод розрахунку наявних коштів на рахунку
    // після зняття певної суми коштів
    private static double getBalance(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}
