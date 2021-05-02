package practica2Java;

import java.util.List;
import java.util.Scanner;

public class ScanInput {

    private static final Scanner input = new Scanner(System.in);

    public static String askOption() {
        String letter;
        do {
            System.out.println(" ");
            System.out.println("\u001B[34m-----------------------------------------------------\u001B[0m");
            System.out.println("\u001B[34m                  Choose an option\u001B[0m");
            System.out.println("\u001B[34m-----------------------------------------------------\u001B[0m");
            System.out.println("\u001B[36mMostrar los valores introducidos (a)\u001B[0m");
            System.out.println("\u001B[33mMostrar los valores introducidos en orden inverso (b)\u001B[0m");
            System.out.println("\u001B[36mMostrar la media de los valores introducidos y contar los ceros (c)\u001B[0m");
            System.out.println("\u001B[33mContar caracteres de un texto (d)\u001B[0m");
            System.out.println("\u001B[36mInvertir texto (e)\u001B[0m");
            System.out.println("\u001B[33mEliminar espacios de un texto (f)\u001B[0m");
            System.out.println("\u001B[36mConcatenar cadenas de texto (g)\u001B[0m");
            System.out.println("\u001B[33mSubstituir vocales de un texto (h)\u001B[0m");
            System.out.println("\u001B[36mMostrar el código ASCII de los caracteres introducidos (i)\u001B[0m");
            System.out.println("\u001B[33mQuit\u001B[0m");
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
            System.out.println("\u001B[31mNot a valid option\u001B[0m");
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
            System.out.println("\u001B[31mNot a valid input\u001B[0m");
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
            System.out.println("\u001B[31mThe input letter is not a vowel\u001B[0m");
        }
        return flag;
    }
}
