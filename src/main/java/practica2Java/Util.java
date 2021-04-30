package practica2Java;

import java.util.List;
import java.util.Scanner;

public class Util {

    private static final Scanner input = new Scanner(System.in);

    public static String askOption() {
        String letter;
        do {
            System.out.println(" ");
            System.out.println("-----------------------------------------------------");
            System.out.println(" Choose an option (a, b, c, d, e, f, g, h, i, quit):");
            System.out.println("-----------------------------------------------------");
            letter = input.nextLine();
        } while (!isRightOption(letter));
        return letter;
    }

    public static boolean isRightOption(String letter) {
        boolean flag = false;
        for (Options option : Options.values()) {
            if (letter.toUpperCase().equals(option.toString())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(" ");
            System.out.println("Not a valid option");
        }
        return flag;
    }

    public static int askNumber() {
        String number;
        do {
            System.out.println(" ");
            System.out.println("Write a number:");
            number = input.nextLine();
        } while (!isNumber(number));
        return Integer.parseInt(number);
    }

    public static boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println(" ");
            System.out.println("Not a valid input");
            return false;
        }
    }

    public static int[] populateArray() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = askNumber();
        }
        return numbers;
    }

    public static int calculateAvg(List<Integer> numbers) {
        try {
            int avg = 0;
            for (Integer number : numbers) {
                avg += number;
            }
            return avg / numbers.size();
        } catch (ArithmeticException ae) {
            return 0;
        }
    }

    public static String askSentence() {
        System.out.println(" ");
        System.out.println("Write a sentence:");
        return input.nextLine();
    }

    public static String askVowel() {
        String vowel = "";
        while (!isRightVowel(vowel)) {
            System.out.println(" ");
            System.out.println("Write a vowel:");
            vowel = input.nextLine();
        }
        return vowel;
    }

    public static boolean isRightVowel(String letter) {
        boolean flag = false;
        for (Vowels vowel : Vowels.values()) {
            if (letter.toUpperCase().equals(vowel.toString())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(" ");
            System.out.println("The input letter is not a vowel");
        }
        return flag;
    }
}
