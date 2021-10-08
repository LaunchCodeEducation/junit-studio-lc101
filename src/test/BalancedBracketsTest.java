package test;
import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    @Test
    public void MultiplePairsBracketsWithSomeCharactersInsideAndAroundReturnsFalse2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ ][[[[[[[[[[]a[bcdef[ghij]klm[]no]p]]]]"));
    }
    @Test
    public void MultiplePairsBracketsWithSomeCharactersInsideAndAroundReturnsFalse1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]a[bcdef[ghij]klm[]no]p]]]]"));
    }
    @Test
    public void MultiplePairsBracketsWithSomeCharactersInsideAndAroundReturnsTrue2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][[]a[bcdef[ghij]klm[]no]p]]]"));
    }
    @Test
    public void MultiplePairsBracketsWithSomeCharactersInsideAndAroundReturnsTrue1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]a[bcdef[ghij]klm[]no]p]"));
    }
    @Test
    public void onlyOnePairBracketsWithSomeCharactersInsideAndAroundReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abcdef[ghij]klmnop"));
    }
    @Test
    public void onlyOnePairBracketsWithSomeCharactersAroundReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abcdefghij[]klmnop"));
    }
    @Test
    public void onlyOnePairBracketsWithSomeCharactersOutsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abcdefghijklmnop[]"));
    }
    @Test
    public void onlyOnePairBracketsWithSomeCharactersInsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abcdefghijklmnop]"));
    }
    @Test
    public void onlyOneClosedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void onlyOneOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}
