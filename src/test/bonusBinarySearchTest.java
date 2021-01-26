package test;

import org.junit.Test;
import main.BonusBinarySearch;
import static org.junit.Assert.*;

public class bonusBinarySearchTest {

    static BonusBinarySearch b;
    static int[] sorted = { 2, 4, 5, 10, 11, 22, 44, 100, 150 };

    @Test
    public void smallNumberSearch() {
        assertEquals(0, BonusBinarySearch.binarySearch(sorted, 2));
    }

    @Test
    public void largeNumberSearch() {
        assertEquals(7, BonusBinarySearch.binarySearch(sorted, 100));
    }

    @Test
    public void middleNumberSearch() {
        assertEquals(4, BonusBinarySearch.binarySearch(sorted, 11));
    }

    @Test
    public void missingNumberSearch() {
        assertEquals(-1, BonusBinarySearch.binarySearch(sorted, 50));
    }

}

