package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class BalancedBracketsTest {

    BalancedBrackets test_brackets;
    @Before
    public void createBalancedBracketsObject(){
        test_brackets = new BalancedBrackets();
    }
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void onlyBracketsReturnsTrueOrFalse() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsTestWord1() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void onlyBracketsTestWord2() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlyBracketsTestWord3() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void onlyBracketsTestWord4() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void onlyBracketsTestWord5() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }

    @Test
    public void onlyBracketsTestWord6() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }

    @Test
    public void onlyBracketsTestWord7() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[[])(]"));
    }

    @Test
    public void onlyBracketsTestWord8() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsTestSentence() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[LaunchCode], Launch[Code], []LaunchCode, []"));
    }


}
