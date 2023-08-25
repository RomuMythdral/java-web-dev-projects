package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");

        radius = input.nextDouble();
        while (radius <0) {
            System.out.println("Enter a valid number!");


            double radius = input.nextDouble();
        }
        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + "is: "
        + area);

        input.close();
    }
}
