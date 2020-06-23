package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        boolean flag = false;
        while (!flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a radius: ");

            if (scanner.hasNextDouble()) {
                double radius = scanner.nextDouble();
                if (radius < 0) {
                    System.out.println("Please enter a positive number");
                }
                else {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                    flag = true;
                }
            }
            else {
                System.out.println("Please enter a valid number");
            }
        }
    }
}
