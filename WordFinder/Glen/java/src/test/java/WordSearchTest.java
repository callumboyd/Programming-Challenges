import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {

    private static final WordSearch WORD_SEARCH = new WordSearch();
    private static final String[][] MATRIX = new String[][]{
            {"F", "A", "C", "I"},
            {"O", "B", "Q", "P"},
            {"A", "N", "O", "B"},
            {"M", "A", "S", "S"}
    };

    @Test
    public void testVerticalWordInCol1() {
        assertTrue(WORD_SEARCH.search(MATRIX, "FOAM"));
    }

    @Test
    public void testWordNotFound() {
        assertFalse(WORD_SEARCH.search(MATRIX, "SOSO"));
    }

    @Test
    public void testHorizontalWordInRow1() {
        assertTrue(WORD_SEARCH.search(MATRIX, "FACI"));
    }

    @Test
    public void testHorizontalWordInRow2() {
        assertTrue(WORD_SEARCH.search(MATRIX, "OBQP"));
    }


    @Test
    public void testVerticalWordInCol2() {
        assertTrue(WORD_SEARCH.search(MATRIX, "ABNA"));
    }

    @Test
    public void testVerticalWordInCol4() {
        assertTrue(WORD_SEARCH.search(MATRIX, "IPBS"));
    }

    @Test
    public void testHorizontalWordInRow4() {
        assertTrue(WORD_SEARCH.search(MATRIX, "MASS"));
    }
}