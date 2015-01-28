package AutoTests;

import Implementations.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;
import Error.ErrorMessage;

public class LinkedListTest {

    private LinkedList TestLL = new LinkedList();
    private String A = "A";
    private String B = "B";
    private String C = "C";

    @Test
    public void testIsEmpty(){
            boolean expected = true;
            boolean output = TestLL.isEmpty();
            assertEquals(expected, output);

    }

    @Test
    public void testSize(){
        TestLL.add(A);
        int expected = 1;
        int output = TestLL.size();
        assertEquals(expected, output);
    }

    @Test
    public void testGet(){
        TestLL.add(A);
        TestLL.add(B);
        TestLL.add(C);
        Object expected = B;
        Object observed = TestLL.get(1).getReturnValue();
        assertEquals(expected, observed);
    }

    @Test
    public void testRemove(){
        TestLL.add(A);
        TestLL.add(B);
        TestLL.add(C);
        TestLL.remove(1);
        Object expected = C;
        Object output = TestLL.get(1).getReturnValue();
        assertEquals(expected, output);
    }

    @Test
    public void testAdd(){
        Object expected = ErrorMessage.NO_ERROR;
        TestLL.add(A);
        TestLL.add(B);
        TestLL.add(C);
        String I = "I";
        Object output = TestLL.add(2, I).getReturnValue();
        assertEquals(expected, output);
    }

    @Test
    public void testAddout(){
        TestLL.add(A);
        TestLL.add(B);
        TestLL.add(C);
        String I = "I";
        Object expected = I;
        TestLL.add(2, I).getReturnValue();
        Object output = TestLL.get(2).getReturnValue();
        assertEquals(expected, output);


    }

    @Test
    public void testAdd1(){
        Object expected = ErrorMessage.NO_ERROR;
        TestLL.add(A);
        Object output = TestLL.add(0).getReturnValue();
        assertEquals(expected, output);
    }
}