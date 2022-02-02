package test;

import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {


    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWithCharsInsideIsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void outputIsFalseWithOneBracketMissing() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }

    @Test
    public void outputIsFalseWithNoBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }

    @Test
    public void outputIsFalseWithBackwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launchcode["));
    }

    @Test
    public void outputIsFalseWithMismatchedBracketsWithOneMatchedBracketMiddle() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("}}}]]][asdf2!PPP{{{]]]{"));
    }

    @Test
    public void outputIsFalseWithMismatchedBracketsWithOneMatchedBracketFirstEndingBracketOpposite() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[ghj]ghj[fgjh"));
    }

    @Test
    public void outputIsFalseWithMismatchedBracketsWithOneMatchedBracketFirstEndingBracketSame() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[ghj]ghj]fgjh"));
    }

    @Test
    public void outputIsFalseWithMismatchedBracketsWithOneMatchedBracketEnd() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[hgj[ghj]gfjh"));
    }

    @Test
    public void outputIsFalseWithMismatchedBracketsWithOneMatchedBracketEndMismatchedOpposite() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]hgj[ghj]gfjh"));
    }

    @Test
    public void outputIsTrueWithMultipleMatchedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("adsf[fgjh]asd[dgh]asdf"));
    }

    @Test
    public void outputIsFalseWithSameNumberOfEachBracketAndOneMatch() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[[[]"));
    }

    @Test
    public void outputIsFalseWithSameNumberOfEachBracketAndOneMatchAtBeginning() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]]][[["));
    }
}
