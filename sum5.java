import java.util.Scanner;

public class sum5 {
    public static void main(String[] args) {

        int total = 0;
        int number = 0;
        int n = 1;
        Scanner scan = new Scanner(System.in);


        while(number < 5){
            System.out.println("Digite um número: ");
            n = scan.nextInt();
            number++;
            total = total + n;
        }


        System.out.println("Total is:"+ total);

    }
}
