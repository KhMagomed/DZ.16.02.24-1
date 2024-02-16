package ru.netology;

public class CreditPaymentService {
    public int calculate(int sumCredit, double percent, int term) {

        double stavka = percent / 12 * 0.01;
        double Delimoe = stavka * Math.pow((1 + stavka),term);
        double delitel = Math.pow((1 + stavka),term) -1;
        double monthPay = (sumCredit * (Delimoe / delitel));

        return (int) monthPay;

    }
}
