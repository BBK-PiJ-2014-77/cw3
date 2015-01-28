package AutoTests;

import Implementations.LinkedList;
import Implementations.StackImpl;
import Interfaces.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackImplTest {

    private List SL = new LinkedList();
    private StackImpl SI = new StackImpl(SL);
    private String A = "A";
    private String B = "B";
    private String C = "C";


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