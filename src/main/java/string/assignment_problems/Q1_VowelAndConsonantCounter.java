package string.assignment_problems;

public class Q1_VowelAndConsonantCounter {

    public static void countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            } else if (ch != ' ') {
                consonantCount++;
            }
        }

        System.out.println(
            "Vowels: " + vowelCount
            + " | Consonants: " + consonantCount
        );
    }

    public static void main(String[] args) {
        String text = "Java Programming";

        countVowelsAndConsonants(text);
    }
}