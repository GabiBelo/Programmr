import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Count to: ");
        int number = scan.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.print(i);
        }

    }
}
