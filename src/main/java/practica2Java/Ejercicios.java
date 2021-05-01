package practica2Java;

import java.util.ArrayList;
import java.util.List;

public class Ejercicios {

    private static final StringBuilder numberString = new StringBuilder();

    // a
    public static void showFiveNumbers() {
        int[] numbers = ScanInput.populateArray();
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                numberString.append(numbers[i]).append(", ");
            } else {
                numberString.append(numbers[i]);
            }
        }
        System.out.println(" ");
        System.out.println("\u001B[32mNumbers: " + numberString + "\u001B[0m");
    }

    // b
    public static void showFiveNumbersReverse() {
        int[] numbers = ScanInput.populateArray();
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                numberString.append(numbers[i]).append(", ");
            } else {
                numberString.append(numbers[i]);
            }
        }
        System.out.println(" ");
        System.out.println("\u001B[32mNumbers in reverse order: " + numberString + "\u001B[0m");
    }

    // c
    public static void printAvgZeroCount() {
        int[] numbers = ScanInput.populateArray();
        List<Integer> positiveNums = new ArrayList<>();
        List<Integer> negativeNums = new ArrayList<>();
        int zeroCount = 0;
        for (int number : numbers) {
            if (number > 0) {
                positiveNums.add(number);
            } else if (number < 0) {
                negativeNums.add(number);
            } else {
                zeroCount++;
            }
        }
        System.out.println(" ");
        System.out.println("\u001B[32mThe avg of positive numbers is: " + ScanInput.calculateAvg(positiveNums) + "\u001B[0m");
        System.out.println("\u001B[32mThe avg of negative numbers is: " + ScanInput.calculateAvg(negativeNums) + "\u001B[0m");
        System.out.println("\u001B[32mThe count of zeros is: " + zeroCount + "\u001B[0m");
    }

    // d
    public static int countChars(String sentence) {
        String[] words = sentence.split(" ");
        int size = 0;
        for (String word : words) {
            size += word.length();
        }
        return size;
    }

    // e
    public static String printReverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reverseSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence.append(new StringBuilder(words[i]).reverse()).append(" ");
        }
        return reverseSentence.toString().trim();
    }

    // f
    public static String printSentenceWithoutSpaces(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder noSpaceSentence = new StringBuilder();
        for (String word : words) {
            noSpaceSentence.append(word);
        }
        return noSpaceSentence.toString().trim();
    }

    // g
    public static String concatTwoStrings(String firstString, String secondString) {
        return firstString.concat(secondString).trim();
    }

    // h
    public static void changeStringVowels(String word, String letter) {
        String newWord = "";
        String[] letters = word.split("");
        for (int i = 0; i < letters.length; i++) {
            newWord = word.replaceAll("[aeiou]", letter);
        }
        System.out.println(newWord);
    }

    // i
    public static void charToAsciiCode(String word) {
        String[] letters = word.split("");
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            System.out.println("\u001B[32mThe ASCII code of " + letters[i] + " is: "  + (int) character + "\u001B[0m");
        }
    }
}
