package practica2Java;

import java.util.ArrayList;
import java.util.List;

public class Ejercicios {

    private static final StringBuilder numberString = new StringBuilder();

    // a
    public static void showFiveNumbers() {
        int[] numbers = Util.populateArray();
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                numberString.append(numbers[i]).append(", ");
            } else {
                numberString.append(numbers[i]);
            }
        }
        System.out.println(" ");
        System.out.println("Numbers: " + numberString);
    }

    // b
    public static void showFiveNumbersReverse() {
        int[] numbers = Util.populateArray();
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                numberString.append(numbers[i]).append(", ");
            } else {
                numberString.append(numbers[i]);
            }
        }
        System.out.println(" ");
        System.out.println("Numbers in reverse order: " + numberString);
    }

    // c
    public static void printAvgZeroCount() {
        int[] numbers = Util.populateArray();
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
        System.out.println("The avg of positive numbers is: " + Util.calculateAvg(positiveNums));
        System.out.println("The avg of negative numbers is: " + Util.calculateAvg(negativeNums));
        System.out.println("The count of zeros is: " + zeroCount);
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
        return reverseSentence.toString();
    }

    // f
    public static String printSentenceWithoutSpaces(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder noSpaceSentence = new StringBuilder();
        for (String word : words) {
            noSpaceSentence.append(word);
        }
        return noSpaceSentence.toString();
    }

    // g
    public static String concatTwoStrings(String firstString, String secondString) {
        return firstString.concat(secondString);
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
            System.out.println("The ASCII code of " + letters[i] + " is: "  + (int) character);
        }
    }
}
