package wordcounter;
import java.util.*;

public class WordStatisticsMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WordStatistics results = new WordStatistics();
        String input;
        //Så länge terminate inte är initierad så fyller man i text och det blir storade i inputs
        //i WordStatistics objektet
        System.out.println("Ange ord eller skriv 'Stop' för att avsluta och få resultat.");
        while(!results.terminateTyped()) {
            input = scan.nextLine();
            results.inputs(input);
        }
        //Main hämtar de storade inputsen från WordStatistics o assignar dem till integers och Strings
        int amountSigns = results.getCountSigns();
        int amountLines = results.getCountLines();
        int wordCount = results.getTotalWords();
        String longestWord = results.getLongestWord();
        //Programet printar ut informationen
        System.out.println("Du skrev " + amountLines + " rader.");
        System.out.println("De " + amountLines + " raderna innehöll " + wordCount + " ord.");
        System.out.println("De " + wordCount + " orden bestod av " + amountSigns + " tecken.");
        System.out.println("Av de " + wordCount + " orden så var det längsta ordet: " + longestWord + ".");
    }
}
