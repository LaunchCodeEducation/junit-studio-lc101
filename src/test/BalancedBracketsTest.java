package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
/*
         * These strings have balanced brackets:
            *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
            *
            * While these do not:
            *   "[LaunchCode", "Launch]Code[", "[", "]["
            */
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void oneSetBracketTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }




}
