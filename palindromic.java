import java.util.Scanner;

public class palindromic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String texto = sc.next();


        String aux = "";
        int i;

        aux = new StringBuffer(texto).reverse().toString();
        if (texto.equals(aux)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
