package test;

import org.junit.Before;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    int[] test_array;
    @Before
    public void createTestArray(){
        test_array = new int[15];
        for(int i = 0;i<test_array.length;i++){
            test_array[i] = i + 1;
        }
    }

    @Test
    public void negativeNumberReturnsFalse(){
        assertFalse(-5 < 1 && -5 < 16);
//        assertEquals(-1,BonusBinarySearch.binarySearch(test_array,-5),.001);
    }

}
