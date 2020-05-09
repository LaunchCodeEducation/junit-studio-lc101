package test;

import main.BalancedBrackets;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //TODO
    // -needs to return true if []
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void shouldBeFalseLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void shouldBeFalseRightBracketLeftBracketString() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void shouldBeFalseLeftBracketString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void shouldBeFalseStringRightBracketStringLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void shouldBeTrueLeftBracketRightBracketString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void shouldBeTrueStringLeftBracketStringRightBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void shouldBeTrueLeftBracketStringRightBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void shouldBeTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("][]"));
    }


//    //TODO
//    // -needs to take a string (throw error?)
//    @Test(expected = IllegalArgumentException.class)
//    public void onlyTakesStrings() {
//        Scanner input = new Scanner(System.in);
//        assertFalse(BalancedBrackets.hasBalancedBrackets(input.nextLine()));
//        fail("Should not accept non sting arguments");
//    }

    //TODO
    // -needs to take a single parameter (throw error?)
    //TODO



    //TODO
    // -true (4) "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
    //TODO
    // -needs to return false if there are not [ and ] (is first and this one the same thing?)

}
