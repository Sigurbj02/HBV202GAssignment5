package is.hi.hbv202g.ass5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void testPopReturnsPushedValue() {
        int number1 = 385;
        int number2 = 384658;
        stack.push(number1);
        stack.push(number2);
        assertEquals(number2, stack.pop());
        assertEquals(number1, stack.pop());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack() {
        stack.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStack() {
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i + 1);
        }
        stack.push(67);
    }
}
