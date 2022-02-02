package test;

import org.junit.Before;
import main.BonusBinarySearch;
import org.junit.Test;

public class BonusBinarySearchTest {
    int[] test_array;
    @Before
    public void createTestArray(){
        test_array = new int[15];
        for(int i = 0;i<test_array.length;i++){
            test_array[i] = i + 1;
        }
    }


}
