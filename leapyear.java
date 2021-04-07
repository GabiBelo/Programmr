import java.util.Scanner;
//Write a program that which takes an year "N" as input and prints true if N corresponds to a leap year,
//and false otherwise. Assumes N >= 1582, corresponding to a year in the Gregorian calendar.

public class leapyear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to be checked: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;

        if (year % 4 != 0) {
            isLeapYear = false;
        }
        else if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 !=0) {
                isLeapYear = false;
            }
            else {
                isLeapYear = true;
            }
        }


        System.out.println(isLeapYear);

    }
}
