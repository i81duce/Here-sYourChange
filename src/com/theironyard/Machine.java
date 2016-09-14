package com.theironyard;//Created by KevinBozic on 8/31/16.

import java.io.IOException;
import java.util.Scanner;

public class Machine {

    Scanner scanner = new Scanner(System.in);

    public void run() throws IOException {
        while (true) {
            System.out.println("Enter the total costs of your purchase: ");
            float total = Float.valueOf(scanner.nextLine());
            System.out.println("The amount you entered is " + total);


            System.out.println("Enter amount you'd like to give: ");
            float userAmount = Float.valueOf(scanner.nextLine());
            System.out.println("The amount you entered is " + userAmount);

            float change = userAmount - total;

            System.out.println("Your change is " + change);
        }
    }
}
