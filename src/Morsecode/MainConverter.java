package Morsecode;

import java.util.Scanner;

public class MainConverter {

    public static void main(String[] args) {

        Converter converter = new Converter();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Would you like to convert English to Morse (yes or no)? ");
            String answer = scan.nextLine();

            if (answer.equals("yes")) {
                System.out.println("Please enter the text you want to translate into Morse code: ");
                String english = scan.nextLine();
                System.out.println(converter.toMorse(english));
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.print("Morse to English? ");
                String answer2 = scan.nextLine();
                if (answer2.equalsIgnoreCase("yes")) {
                    System.out.println("Please enter the Morse code you want to translate into English: ");
                    String code = scan.nextLine();
                    System.out.println(converter.toEnglish(code));
                }
            }
        }
    }
}
