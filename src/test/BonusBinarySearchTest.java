package test;

import org.junit.Before;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    int[] test_array = new int[15];
    @Before
    public void createTestArray(){
        test_array = new int[15];
        for(int i = 0;i<test_array.length;i++){
            test_array[i] = i + 1;
        }
    }

    @Test
    public void negativeNumberReturnsTrue(){
        assertTrue(BonusBinarySearch.binarySearch(test_array,-5) == -1);
//        assertEquals(-1,BonusBinarySearch.binarySearch(test_array,-5),.001);
    }
    @Test
    public void greaterThanValueAtLastIndexReturnsTrue(){
        assertTrue(BonusBinarySearch.binarySearch(test_array,(test_array.length + 1)) == -1);
    }
    @Test
    public void nIsInArrayOfIntsReturnsTrue(){
        assertTrue(BonusBinarySearch.binarySearch(test_array,8) != -1);
    }



}
