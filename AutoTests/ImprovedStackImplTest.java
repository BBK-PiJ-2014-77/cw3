package AutoTests;

import Implementations.ImprovedStackImpl;
import Implementations.LinkedList;
import Interfaces.ImprovedStack;
import Interfaces.List;
import Interfaces.Stack;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImprovedStackImplTest {

    private List SL = new LinkedList();
    private ImprovedStack SI = new ImprovedStackImpl(SL);
    private String A = "A";
    private String B = "B";
    private String C = "C";


    @Test
    public void testReverse(){
        SI.push(A);
        SI.push(B);
        ImprovedStack SI2 = SI.reverse();
        Object expected1 = A;
        Object observed1 = SI2.pop().getReturnValue();
        assertEquals(expected1, observed1);
        Object expected2 = B;
        Object observed2 = SI2.pop().getReturnValue();
        assertEquals(expected2, observed2);
    }

    @Test
    public void testRemove(){
        SI.push(A);
        SI.push(B);
        SI.push(C);
        SI.remove(B);
        Object expected1 = C;
        Object observed1 = SI.pop().getReturnValue();
        assertEquals(expected1, observed1);
        Object expected2 = A;
        Object observed2 = SI.pop().getReturnValue();
        assertEquals(expected2, observed2);
    }

    @Test
    public void testIsEmpty(){
        boolean expected = true;
        boolean output = SI.isEmpty();
        assertEquals(output, expected);
    }

    @Test
    public void testSize(){
        SL.add(A);
        SL.add(B);
        int expected = 2;
        int output = SI.size();
        assertEquals(output, expected);
    }

    @Test
    public void testPush(){
        SI.push(A);
        SI.push(B);
        SI.push(C);
        Object expected = C;
        Object output = SI.top().getReturnValue();
        assertEquals(output, expected);
    }

    @Test
    public void testTop(){
        SI.push(A);
        SI.push(B);
        SI.push(C);
        Object expected = C;
        Object output = SI.top().getReturnValue();
        assertEquals(output, expected);
    }

    @Test
    public void testPop(){
        SI.push(A);
        SI.push(B);
        SI.push(C);
        SI.pop();
        Object expected = B;
        Object output = SI.top().getReturnValue();
        assertEquals(output, expected);
    }
}