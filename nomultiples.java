import java.util.Scanner;

public class nomultiples {
    public static void main(String[] args) {

        int N = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scanner.nextInt();

        while (N <= input ) {
            if (((N % 3) == 0) || ((N % 4) == 0))
                N++;
            else
                System.out.println(N++);
        }

    }
}
