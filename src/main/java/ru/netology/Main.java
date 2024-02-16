package ru.netology;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent = 9.99;
        int sumCredit = 1_000_000;

        int monthPay = service.calculate(sumCredit, percent, 12);
        System.out.println(monthPay);

        int monthPay2 = service.calculate(sumCredit, percent, 24);
        System.out.println(monthPay2);

        int monthPay3 = service.calculate(sumCredit, percent, 36);
        System.out.println(monthPay3);
    }
}