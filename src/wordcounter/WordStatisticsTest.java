package wordcounter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordStatisticsTest {
    //Test to count the total amount of characters in the inputs.
    @Test
    public void testCountSigns() {
        WordStatistics wordStatistics = new WordStatistics();
        wordStatistics.inputs("This is a test!");
        int expected = 15;
        int actual = wordStatistics.getCountSigns();
        assertEquals(expected,actual);
    }
    //Test to count the total amount of inputs/lines of words.
    @Test
    public void testCountLines() {
        WordStatistics wordStatistics = new WordStatistics();
        wordStatistics.inputs("This is a test");
        wordStatistics.inputs("This is also a test");
        int expected = 2;
        int actual = wordStatistics.getCountLines();
        assertEquals(expected,actual);
    }
    //Test to count the total amount of words from all inputs.
    @Test
    public void testWordCount() {
        WordStatistics wordStatistics = new WordStatistics();
        wordStatistics.inputs("This is a test");
        int expected = 4;
        int actual = wordStatistics.getTotalWords();
        assertEquals(expected,actual);
    }
}
