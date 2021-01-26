package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


//@
//public void methodReturnTrue()
//assertTrue(className.Method.Name)
public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }


}
