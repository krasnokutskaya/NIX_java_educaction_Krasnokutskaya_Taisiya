package ChatBot.nix.education.java;

import java.util.Scanner;

public class chatbot{
    public static void main(String[] args) {
        System.out.println("Hello! My name is Din." );
        System.out.println("I was created in 2021.");

        System.out.println("Pleas, remind me your name.");

        Scanner scanner = new Scanner(System.in);
        var myName = scanner.next();
        System.out.println("What a great name you have," + myName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3,5 and 7.");

        int valueFirst = scanner.nextInt();
        int valueSecond = scanner.nextInt();
        int valueThird = scanner.nextInt();
        int age = (valueFirst * 70 + valueSecond * 21 + valueThird * 15) % 105;
        System.out.println("Your age is " + age + "; that`s a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want.");

        int count = scanner.nextInt();
        for (int i = 0; i <= count ; i++) {
            System.out.println(i + " ! ");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println ("Why are we using methods?");
        System.out.println ("1. Repeat the statement several times.");
        System.out.println ("2. Split the program into several small subroutines.");
        System.out.println ("3. To determine the execution time of the program.");
        System.out.println ("4. Interrupt the execution of the program.");

        do{
            int answer = scanner.nextInt();
            if (answer == 2){
                System.out.println("Graet, you right!");
                break;
            }else if (answer == 1) {
                System.out.println("Please, try again.");
            }else if (answer == 3) {
                System.out.println("Please, try again.");
            }else if (answer == 4) {
                System.out.println("Please, try again.");
            }
        } while (true);
        System.out.println("Godbye, have a nice day!");
    }
}
