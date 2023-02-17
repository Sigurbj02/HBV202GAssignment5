package is.hi.hbv202g.ass5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntStackTest {
    private IntStack stack;

    @Before
    public void constructEmptyStack() {
        stack = new IntStack();
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    @Test
    public void testFullStackIsFull() {
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

    @Test
    public void testAlmostFullStackIsNotFull() {
        for (int i = 0; i < stack.getCapacity() - 1; i++) {
            stack.push(i + 7);
        }
        assertFalse(stack.isFull());
    }

}
