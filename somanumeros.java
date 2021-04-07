import java.util.Scanner;

public class somanumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userNumber = 1, sum = 0;

        while (userNumber != 0 ) {
            System.out.println("Digite o número: ");
            userNumber = scan.nextInt();
            sum = sum + userNumber;
        }

        System.out.println(sum);

    }
}
