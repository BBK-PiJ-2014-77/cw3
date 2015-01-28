package AutoTests;

import Implementations.FunctionalLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionalLinkedListTest {

    private FunctionalLinkedList TestFLL = new FunctionalLinkedList();
    private String A = "A";
    private String B = "B";
    private String C = "C";


    @Test
    public void testHead(){
        TestFLL.add(A);
        TestFLL.add(B);
        TestFLL .add(C);
        Object expected = A;
        Object output = TestFLL.head().getReturnValue();
        assertEquals(output, expected);
    }

    @Test
    public void testRest(){
        TestFLL.add(A);
        TestFLL.add(B);
        TestFLL.add(C);
        Object expected = 2;
        Object output = TestFLL.rest().size();
        assertEquals(output, expected);
        Object ex2 = B;
        Object ou2 = TestFLL.rest().head().getReturnValue();
        assertEquals(ex2, ou2);
    }
}