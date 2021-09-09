/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double amount = Double.parseDouble(sc.nextLine());
        System.out.print("What is the state? ");
        String state = sc.nextLine();
        System.out.printf("The subtotal is $%.2f",amount);
            if (state.toLowerCase().equals("wi")) {
            double tax = amount * 0.055;
            System.out.print("\nThe Tax is $"+ tax);
            amount = amount + tax;
            System.out.print("\nThe total is $"+ amount);
        }
    }
}