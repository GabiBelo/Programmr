import java.util.Scanner;
//fatorial

public class fatorial {
    public static void main(String args[]){
        System.out.println("Input:");

        Scanner entrada = new Scanner(System.in);

        int fatorial = 1;

        System.out.println("Digite um número para calcular seu fatorial: ");
        int numero = entrada.nextInt();


        while (numero > 1) {
            fatorial = numero * fatorial;
            numero--;
        }

        System.out.println("Factorial of the number is: " + fatorial);


    }
}
