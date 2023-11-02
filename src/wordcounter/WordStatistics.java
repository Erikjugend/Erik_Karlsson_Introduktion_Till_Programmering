package wordcounter;
import java.util.*;
public class WordStatistics {
    //Integers, booleans, arrays och strings för att storea
    // och sortera all information från inputs
    private int countSigns = 0;
    private int countLines = 0;
    private boolean terminate = false;
    private List<String> totalWords = new ArrayList<>();
    private String longestWord = "";
    /*input method som så länge terminate inte är sann (= att stop inte har skrivits)
    räknar alla tecken inklusive mellanslag och punkter, räknar alla inputs från
    användaren aka alla rader med text. Den splitar sedan alla raderna för att kunna
    räkna orden som alla storas i en array och går slutligen igenom alla orden för
    att komma fram till vilket det längsta är.*/
    public void inputs(String input) {
        if(!terminate) {
            if(!input.equalsIgnoreCase("Stop")) {
                countSigns += input.length();
                countLines++;
                totalWords.addAll(Arrays.asList(input.split("\\s+")));
                for(String word : input.split("\\s+")) {
                    if(word.length()>longestWord.length()) {
                        longestWord = word;
                    }
                }
            } else {
                terminate = true;
            }
        }
    }
    //Get methods för att tillåta att informationen hämtas till andra objekt
    public int getCountSigns() {
        return countSigns;
    }
    public int getCountLines() {
        return countLines;
    }
    public boolean terminateTyped() {
        return terminate;
    }
    public int getTotalWords() {
        return totalWords.size();
    }
    public String getLongestWord() {
        return longestWord;
    }
}
