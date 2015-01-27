package AutoTests;

import Implementations.ArrayList;
import Implementations.ReturnObjectImpl;
import Interfaces.ReturnObject;
import org.junit.Before;
import org.junit.Test;
import Error.ErrorMessage;

import static org.junit.Assert.*;

public class ArrayListTest {

    private ArrayList TestAL = new ArrayList();
    private String A = "A";
    private String B = "B";
    private String C = "C";

 //   @Before
 //   public void buildup(){

 //   }

    @Test
    public void testIsEmpty(){
        boolean expected = true;
        boolean output = TestAL.isEmpty();
        assertEquals(expected, output);
    }


    @Test
    public void testSize(){
        TestAL.add(A);
        int expected = 1;
        int output = TestAL.size();
        assertEquals(expected, output);
    }

    @Test
    public void testGet(){
        TestAL.add(A);
        TestAL.add(B);
        TestAL.add(C);
        Object expected = B;
        Object observed = TestAL.get(1).getReturnValue();
        assertEquals(expected, observed);
    }

    @Test
    public void testRemove(){
        TestAL.add(A);
        TestAL.add(B);
        TestAL.add(C);
        TestAL.remove(1);
        Object expected = C;
        Object output = TestAL.get(1).getReturnValue();
        assertEquals(expected, output);
    }

    @Test
    public void testAdd(){

        Object expected = ErrorMessage.NO_ERROR;
        TestAL.add(A);
        TestAL.add(B);
        TestAL.add(C);
        String I = "I";
        Object output = TestAL.add(2, I).getReturnValue();
        assertEquals(expected, output);
    }

    @Test
    public void testAddout(){
        TestAL.add(A);
        TestAL.add(B);
        TestAL.add(C);
        String I = "I";
        Object expected = I;
        TestAL.add(2, I).getReturnValue();
        Object output = TestAL.get(2).getReturnValue();
        assertEquals(expected, output);

    }


    @Test
    public void testAdd1(){
        Object expected = ErrorMessage.NO_ERROR;
        TestAL.add(A);
        Object output = TestAL.add(0).getReturnValue();
        assertEquals(expected, output);
    }
}