package AutoTests;

import Implementations.FunctionalArrayList;
import org.junit.Test;

import static org.junit.Assert.*;
import cw3.ErrorMessage;

public class FunctionalArrayListTest {

    private FunctionalArrayList TestFL = new FunctionalArrayList();
    private String A = "A";
    private String B = "B";
    private String C = "C";

    @Test
    public void testHead(){
        TestFL.add(A);
        TestFL.add(B);
        TestFL.add(C);
        Object expected = A;
        Object output = TestFL.head().getReturnValue();
        assertEquals(output, expected);
    }

    @Test
    public void testRest(){
        TestFL.add(A);
        TestFL.add(B);
        TestFL.add(C);
        Object expected = 2;
        Object output = TestFL.rest().size();
        assertEquals(output, expected);
        Object ex2 = B;
        Object ou2 = TestFL.rest().head().getReturnValue();
        assertEquals(ex2, ou2);
    }

    @Test
    public void testIsEmpty(){
        boolean expected = true;
        boolean output = TestFL.isEmpty();
        assertEquals(expected, output);
    }

    @Test
    public void testSize(){
        TestFL.add(A);
        int expected = 1;
        int output = TestFL.size();
        assertEquals(expected, output);
    }

    @Test
    public void testGet(){
        TestFL.add(A);
        TestFL.add(B);
        TestFL.add(C);
        Object expected = B;
        Object observed = TestFL.get(1).getReturnValue();
        assertEquals(expected, observed);
    }

    @Test
    public void testRemove(){
        TestFL.add(A);
        TestFL.add(B);
        TestFL.add(C);
        TestFL.remove(1);
        Object expected = C;
        Object output = TestFL.get(1).getReturnValue();
        assertEquals(expected, output);
    }

    @Test
    public void testAdd(){

        Object expected = ErrorMessage.NO_ERROR;
        TestFL.add(A);
        TestFL.add(B);
        TestFL.add(C);
        String I = "I";
        Object output = TestFL.add(2, I).getReturnValue();
        assertEquals(expected, output);
    }

    @Test
    public void testAddout(){
        TestFL.add(A);
        TestFL.add(B);
        TestFL.add(C);
        String I = "I";
        Object expected = I;
        TestFL.add(2, I).getReturnValue();
        Object output = TestFL.get(2).getReturnValue();
        assertEquals(expected, output);

    }

    @Test
    public void testAdd1() throws Exception {
        Object expected = ErrorMessage.NO_ERROR;
        TestFL.add(A);
        Object output = TestFL.add(0).getReturnValue();
        assertEquals(expected, output);
    }
}