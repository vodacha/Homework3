package Java.Homework3;

import jdk.jfr.Percentage;

import java.awt.geom.Area;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class JavaHomework3 {
    public static void main(String[] args) {

        //Напишете програма/ метод, която за подадени
        // дължина и височина на правоъгълник,
        // изкарват на конзолата неговият периметър и лице.

        int a = 0;
        int b = 0;
        int Perimeter = 0;
        int Area= 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a:");
        a = scanner.nextInt();

        System.out.println("enter b:");
        b = scanner.nextInt();



        Perimeter = 2 * (a + b);
        System.out.println("The perimeter is: " + Perimeter);

        System.out.println("enter a:");
        a = scanner.nextInt();

        System.out.println("enter b:");
        b = scanner.nextInt();

        Area =a*b;
        System.out.println("The area is is: " + Area);
    }
}
