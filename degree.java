import java.util.Scanner;
//Write Java program to allow the user to input temperature in Celsius and convert it into fahrenheit.

public class degree {
    public static void main(String[] args) {

        Scanner scanCelsius = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius: ");
        double C = scanCelsius.nextDouble();

        final int v = 32;
        final double n = (5/9.0);

        double F = (C/n) + v;
        System.out.println(F);

        System.out.println("The temperature in Fahrenheit is: " + F);


    }
}
