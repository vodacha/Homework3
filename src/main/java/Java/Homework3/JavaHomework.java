package Java.Homework3;

public class JavaHomework {
    public static void main(String[] args) {
        int firstNumber=5;
        int secondNumber=2;
        int thirdNumber=7;
        boolean result = true;

        // Напишете програма/ метод, която приема 3 подадени числа определя кое е най-голяматo

        if (firstNumber > secondNumber && firstNumber > thirdNumber)
        {
            System.out.println("The 5 is the biggest number!");
        }
        else
        {
            System.out.println("the 5 is not the biggest number!");
        }

        if (secondNumber > firstNumber && secondNumber > thirdNumber)
        {
            System.out.println("The 2 is the biggest number!");
        }
        else
        {
            System.out.println("the 2 is not the biggest number!");
        }

        if (thirdNumber > firstNumber && thirdNumber > secondNumber)
        {
            System.out.println("The 7 is the biggest number!");
        }
        else
        {
            System.out.println("the 7 is not the biggest number!");
        }

    }

}
