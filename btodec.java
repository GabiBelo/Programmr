import java.util.Scanner;

public class btodec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString =scanner.nextLine();
        System.out.println("Output: "+Integer.parseInt(binaryString,2));

    }
}
