import java.util.Scanner;
//soma,diferença,divisão,multiplicação

public class arithmatic {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter the 1st number:");
        int num1=scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=scanner.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println("Addition is:"+sum);
        System.out.println("Difference is:"+diff);
        System.out.println("Product is:"+product);
        System.out.println("Quotient is:"+quotient);

    }
}
