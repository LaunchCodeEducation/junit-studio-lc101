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
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleBracketsWithContentReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void singleBracketsBreakingUpContentReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[C]ode"));
    }
    @Test
    public void singleBracketsWithContentsOutsideReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }
    @Test
    public void singleOpeningBracketWithContentReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void singleOpeningBracketWithNoContentReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void singleClosingBracketWithContentReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
    @Test
    public void singleClosingBracketWithNoContentReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void reverseOnlyBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void reverseBracketsSurroundedByContentReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch][Code"));
    }
    @Test
    public void reverseBracketsBrokenUpByContentReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Co[de"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
}
