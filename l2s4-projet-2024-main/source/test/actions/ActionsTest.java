package actions;

import org.junit.Test;
import board.*;
import actions.*;
import actors.*;
public class ActionsTest {

 
    @Test
    public void testToString() {
        Action action = new Action(5) {
            @Override
            public String toString() {
                return "Test Action";
            }
        };
        assertEquals("Test Action", action.toString());
    }
}

