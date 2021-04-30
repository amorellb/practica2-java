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
                    System.out.println("The number of characters of the sentence are: " + Ejercicios.countChars(Util.askSentence()));
                    break;
                case "e":
                    System.out.println(Ejercicios.printReverseSentence(Util.askSentence()));
                    break;
                case "f":
                    System.out.println(Ejercicios.printSentenceWithoutSpaces(Util.askSentence()));
                    break;
                case "g":
                    System.out.println(Ejercicios.concatTwoStrings(Util.askSentence(), Util.askSentence()));
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
                    System.out.println("Oops! Something went wrong");
                    break;
            }
        } while (!option.toUpperCase().equals(Options.QUIT.toString()));
        System.out.println(" ");
        System.out.println("-----------------------------------------------------");
        System.out.println("                      See you!");
        System.out.println("-----------------------------------------------------");
    }
}
