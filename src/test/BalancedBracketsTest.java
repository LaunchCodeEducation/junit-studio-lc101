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
    }
//    @Test
//    public void singleBracketsWithContentsOutsideReturnsTrue(){
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
//    }
//    @Test
//    public void singleBracketsWithContentReturnsTrue(){
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
//    }

}
