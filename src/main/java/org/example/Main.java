package org.example;
import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter membership status (Regular, VIP, Premium): ");

        String membershipStatus = input.nextLine();  // Read user input
        String lowerCaseStatus = membershipStatus.toLowerCase();

        if (lowerCaseStatus.equals("regular") || lowerCaseStatus.equals("vip") || lowerCaseStatus.equals("premium")) {
            System.out.print("Enter age: ");
            int age = input.nextInt();

            float price = calculateMembershipPrice(lowerCaseStatus, age);
            System.out.printf("Price: $%.2f", price); // Print output
        } else {
            System.out.println("Invalid membership status entered.");
        }
    }

    public static float calculateMembershipPrice(String membershipStatus, int age) {
        float price = 0;

        switch(membershipStatus) {
            case "regular":
                if (age < 18) {
                    price = 50;
                } else if (age <= 64) {
                    price = 100;
                } else {
                    price = 75;
                }
                break;

            case "vip":
                if (age < 18) {
                    price = 75;
                } else if (age <= 64) {
                    price = 150;
                } else {
                    price = 112.5F;
                }
                break;

            case "premium":
                if (age < 18) {
                    price = 100;
                } else if (age <= 64) {
                    price = 200;
                } else {
                    price = 150;
                }
                break;

            default:
                break;
        }
        return price;
    };
}