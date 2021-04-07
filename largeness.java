import java.util.Scanner;
//Write a program to find the largest of three numbers and then print whether the "First" or the "Second" or the "Third"
// number is the largest.  If the largest number has a duplicate then "Entered numbers are not distinct." is displayed.

public class largeness {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter three integers:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        if (x > y && x > z) {
            System.out.print("First number is largest.");
        }
        else if (y > x && y > z) {
            System.out.print("Second number is largest.");
        }
        else if (z > x && z > y) {
            System.out.print("Third number is largest.");
        }
        else {
            System.out.print("Entered numbers are not distinct.");
        }



    }
}
