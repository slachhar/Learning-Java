package com.Shefali;

import jdk.jfr.Percentage;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mortgage(scanner);
        FizzBuzz(scanner);
    }

    private static void FizzBuzz(Scanner scanner) {
        System.out.print("Number: ");
        
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (num % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(num);
        }
    }

    private static void Mortgage(Scanner scanner) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        double p;
        double annual_interst_rate;
        double r;
        int years;
        int n;
        double mortgage;

        System.out.print("Principal:");
        p = scanner.nextDouble();

        System.out.print("Annual Interest Rate:");
        annual_interst_rate = scanner.nextDouble();
        r = annual_interst_rate / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years):");
        years = scanner.nextInt();
        n = years * MONTHS_IN_YEAR;

        mortgage = p * (r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);
        NumberFormat format = NumberFormat.getCurrencyInstance();

        System.out.print("Mortgage:");
        System.out.println(format.format(mortgage));
    }
}


