package Java.Homework3;

import java.util.Scanner;

public class JavaHomework1 {


    public static void main(String[] args) {

        // Напишете програма/ метод, която чете число(или се приема като параметър на метод) и изписва в конзолата дали числото е четно или не?

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");

        int number = scanner.nextInt();

        if (number % 2 == 0)

        {
            System.out.println("The number is odd");
        }
        else {
            System.out.println("The number is even");

        }

    }

}
