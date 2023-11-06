package wordcounter;
import java.util.*;
public class WordStatistics {
    //Integers, booleans, arrays and strings to store
    //and sort all information from inputs
    private int countSigns = 0;
    private int countLines = 0;
    private boolean terminate = false;
    private List<String> totalWords = new ArrayList<>();
    private String longestWord = "";
    /*input method that as long as terminate is not true (= that stop has not been typed)
    counts all characters including spaces, dots, commas etc. Counts all inputs from
    the user, aka all lines of text. It then splits all the lines to count
    the words that are all stored in an array and finally checks all the words to
    determine which one is the longest.*/
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
    //Get methods to allow that the information is retrieved to other objects.
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
