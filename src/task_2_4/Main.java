package task_2_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер вклада: ");
        double depositAmount = scanner.nextDouble();
        System.out.print("Введите число процентов по вкладу: ");
        double depositPercent = scanner.nextDouble();
        double depositAmountForYear = 0;
        int year = 0;
        for (int i = 0; i < 5; i++) {
            depositAmountForYear = depositAmountForYear + depositAmount + depositAmount * depositPercent * 0.01;
            String resultDepositAmountForYear = String.format("%.2f", depositAmountForYear);
            year += 1;
            System.out.println("Размер депозита за " + year + " год составит: " + resultDepositAmountForYear);
        }
    }
}
