package test;

import org.junit.Test;

import static main.BonusBinarySearch.binarySearch;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BonusBinarySearchTest {

    @Test
    public void invalidTestTrue4() {
        assertEquals(-1, binarySearch(new int[]{}, 10));
    }

     @Test
    public void invalidTestTrue3() {
        assertEquals(-1, binarySearch(new int[]{1,2,3,119835,198354,19835,1,1,1,1,100, 100, 1000} , 10000000));
    }

     @Test
    public void invalidTestTrue2() {
        assertEquals(-1, binarySearch(new int[]{1,2,3,119835,198354,19835,1,1,1,1,100, 100, 1000}, 10));
    }

     @Test
    public void invalidTestTrue1() {
        assertEquals(-1, binarySearch(new int[] {1,2,3,119835,198354,19835,1,1,1,1,100, 100, 1000}, 10));
    }

     @Test
    public void invalidTestFalse3() {
         assertEquals(-1, binarySearch(new int[] {1,2,3,119835,198354,19835,1,1,1,1,100, 100, 1000}, 10));
    }

     @Test
    public void invalidTestFalse2() {
         assertEquals(-1, binarySearch(new int[]{1,2,3,119835,198354,19835,1,1,1,1,100}, 10));
    }

     @Test
    public void invalidTestFalse1() {
        assertEquals(-1, binarySearch(new int[]{1,2,3,119835,198354,19835,1,1,1,1}, 19839));
    }

     @Test
    public void validTest4() {
        assertEquals(-1, binarySearch(new int[]{1,2,3,119835,198354,19835,1,1,1,1,-1}, -1));
    }

     @Test
    public void validTest3() {
        assertEquals(19835, binarySearch(new int[]{1,2,3,119835,198354,19835,1,1,1,1}, 19835));
    }

     @Test
    public void validTest2() {
        assertEquals(10, binarySearch(new int[]{10,1,2,3,1,1,1,1,1}, 10));
    }

     @Test
    public void validTest1() {
        assertEquals(10, binarySearch(new int[]{1,2,3,10}, 10));
    }

     @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
        assertEquals(true, true);
    }
}
