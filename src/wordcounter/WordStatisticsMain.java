package wordcounter;
import java.util.*;

public class WordStatisticsMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WordStatistics results = new WordStatistics();
        String input;
        //As long as terminate isn't initiated you type text, and it gets stored
        //in the WordStatistics object.
        System.out.println("Ange ord eller skriv 'Stop' för att avsluta och få resultat.");
        while(!results.terminateTyped()) {
            input = scan.nextLine();
            results.inputs(input);
        }
        //Main retrieves the stored inputs from WordStatistics and assigns them to integers och Strings
        int amountSigns = results.getCountSigns();
        int amountLines = results.getCountLines();
        int wordCount = results.getTotalWords();
        String longestWord = results.getLongestWord();
        //The program prints out the information
        System.out.println("Du skrev " + amountLines + " rader.");
        System.out.println("De " + amountLines + " raderna innehöll " + wordCount + " ord.");
        System.out.println("De " + wordCount + " orden bestod av " + amountSigns + " tecken.");
        System.out.println("Av de " + wordCount + " orden så var det längsta ordet: " + longestWord + ".");
    }
}
