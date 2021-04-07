import java.util.Scanner;
//Write a simple program that will compute the amount of interest that is earned on an investment over a period of
// one year.  The initial amount of the investment and the interest rate are input by the user.
//(Enter 5 for 5% interest rate)

public class simpleinterest {
    public static void main(String[] args) {

        double principal;  // the value of the investment
        double rate;       // the annual interest rate
        double interest;   // the interest earned during the year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial investment: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        rate = scanner.nextDouble();

        interest = principal + (principal*rate/100);



        System.out.println("The value of the investment after one year is: "+ interest);

    }
}
