package practica2Java;

public class Menu {
    public static void main(String[] args) {

        String option;
        do {
            option = Util.askOption();
            switch (option.toLowerCase()) {
                case "a":
                    Ejercicios.showFiveNumbers();
                    break;
                case "b":
                    Ejercicios.showFiveNumbersReverse();
                    break;
                case "c":
                    Ejercicios.printAvgZeroCount();
                    break;
                case "d":
                    System.out.println("\u001B[32mThe number of characters of the sentence are: " + Ejercicios.countChars(Util.askSentence()) + "\u001B[0m");
                    break;
                case "e":
                    System.out.println("\u001B[32m" + Ejercicios.printReverseSentence(Util.askSentence()) + "\u001B[0m");
                    break;
                case "f":
                    System.out.println("\u001B[32m" + Ejercicios.printSentenceWithoutSpaces(Util.askSentence()) + "\u001B[0m");
                    break;
                case "g":
                    System.out.println("\u001B[32m" + Ejercicios.concatTwoStrings(Util.askSentence(), Util.askSentence()) + "\u001B[0m");
                    break;
                case "h":
                    Ejercicios.changeStringVowels(Util.askSentence(), Util.askVowel());
                    break;
                case "i":
                    Ejercicios.charToAsciiCode(Util.askSentence());
                    break;
                case "quit":
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("\u001B[31mOops! Something went wrong\u001B[0m");
                    break;
            }
        } while (!option.toUpperCase().equals(Options.QUIT.toString()));
        System.out.println(" ");
        System.out.println("\u001B[34m-----------------------------------------------------\u001B[0m");
        System.out.println("\u001B[34m                      See you!\u001B[0m");
        System.out.println("\u001B[34m-----------------------------------------------------\u001B[0m");
    }
}
