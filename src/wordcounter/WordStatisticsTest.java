package wordcounter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordStatisticsTest {
    //Test för att räkna totala tecken i inputs
    @Test
    public void testCountSigns() {
        WordStatistics wordStatistics = new WordStatistics();
        wordStatistics.inputs("This is a test!");
        int expected = 15;
        int actual = wordStatistics.getCountSigns();
        assertEquals(expected,actual);
    }
    //Test för att räkna total mängden inputs=rader ord.
    @Test
    public void testCountLines() {
        WordStatistics wordStatistics = new WordStatistics();
        wordStatistics.inputs("This is a test");
        wordStatistics.inputs("This is also a test");
        int expected = 2;
        int actual = wordStatistics.getCountLines();
        assertEquals(expected,actual);
    }
    //Test för att räkna totala mängden ord.
    @Test
    public void testWordCount() {
        WordStatistics wordStatistics = new WordStatistics();
        wordStatistics.inputs("This is a test");
        int expected = 4;
        int actual = wordStatistics.getTotalWords();
        assertEquals(expected,actual);
    }
}
