package application;

import entities.PF;
import entities.PJ;
import entities.Taxpayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Taxpayer> taxpayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer " + i + " data:");
            System.out.print("Individual(PF) or company(PJ) (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double annualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenses = sc.nextDouble();
                taxpayerList.add(new PF(healthExpenses, name, annualIncome));
            }
            if (ch == 'c') {
                System.out.print("Number of employees: ");
                Integer numberEmployees = sc.nextInt();
                taxpayerList.add(new PJ(numberEmployees, name, annualIncome));

            }

        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Taxpayer taxpayer : taxpayerList) {
            System.out.println(taxpayer.showTax());

        }

        System.out.println();
        System.out.println("TOTAL TAXES: ");
        double sum = 0;
        for (Taxpayer taxpayer : taxpayerList) {
            sum += taxpayer.calcTax();

        }

        System.out.println(sum);
        sc.close();

    }

}
