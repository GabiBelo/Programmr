import java.util.Scanner;
//Complete the given Java program such that it multiplies the two inputted numbers.

public class multiply {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int num1=scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=scanner.nextInt();

        int product = num2 * num1;

        System.out.println("The product of the two numbers is:"+product);

    }

}
