//Write a java program to ask the user for his/her name, age, and salary (double). Follow the input/output format.

import java.util.Scanner;

public class NAS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        double salary;

        System.out.println("Hello. What's your name? ");
        name = scan.next();

        System.out.println("Hi, " + name +"!" + " How old are you? ");
        age = scan.nextInt();

        System.out.println("So you're " + age + "?" + " That's not old at all!");
        System.out.println("How much do you make " + name + "?");
        salary = scan.nextDouble();

        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
    }
}
