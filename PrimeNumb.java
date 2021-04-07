//Write a Java program to find if the input number is prime or not
import java.util.Scanner;

public class PrimeNumb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input number: ");
        int n = scanner.nextInt();

        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("Input number is a prime number");
        else
            System.out.println("Input number is not a prime number");


    }
}
