package AutoTests;

import Implementations.SampleableListImpl;
import Interfaces.SampleableList;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleableListImplTest {

    private SampleableList SL = new SampleableListImpl();
    private String A = "A";
    private String B = "B";
    private String C = "C";
    private String D = "D";


    @Test
    public void testSample(){
        SL.add(A);
        SL.add(B);
        SL.add(C);
        SL.add(D);
        SampleableList output = SL.sample();
        int expected1 = 2;
        String expected2 = A;
        String expected3 = C;
        assertEquals(output.size(), expected1);
        assertEquals(output.get(0).getReturnValue(), expected2);
        assertEquals(output.get(1).getReturnValue(), expected3);
    }
}