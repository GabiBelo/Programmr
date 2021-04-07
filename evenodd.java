import java.util.Scanner;
//Given a number, is it odd or even?

public class evenodd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num1 = scan.nextInt();

        if (num1 % 2 == 0 ) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}
