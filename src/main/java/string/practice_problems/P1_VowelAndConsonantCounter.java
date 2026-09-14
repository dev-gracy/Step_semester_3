package string.practice_problems;

import java.util.Scanner;

public class P1_VowelAndConsonantCounter {

    static void countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (character == ' ') {
                continue;
            }

            char lowerCaseCharacter = Character.toLowerCase(character);

            if (lowerCaseCharacter == 'a' ||
                lowerCaseCharacter == 'e' ||
                lowerCaseCharacter == 'i' ||
                lowerCaseCharacter == 'o' ||
                lowerCaseCharacter == 'u') {

                vowels++;

            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        countVowelsAndConsonants(text);

        scanner.close();
    }
}