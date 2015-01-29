package AutoTests;

import Implementations.ReturnObjectImpl;
import Interfaces.ReturnObject;
import org.junit.Test;

import static org.junit.Assert.*;
import Error.ErrorMessage;

public class ReturnObjectImplTest {

    private String StringTest = "Test";
    private ErrorMessage ErrorTest = ErrorMessage.INDEX_OUT_OF_BOUNDS;

    @Test
    public void testHasError1(){
        ReturnObject Test1 = new ReturnObjectImpl(StringTest);
        boolean expected = false;
        boolean  output = Test1.hasError();
        assertEquals(expected, output);
    }

    @Test
    public void testHasError2(){
        ReturnObject Test1 = new ReturnObjectImpl(ErrorTest);
        boolean expected = true;
        boolean output = Test1.hasError();
        assertEquals(expected, output);
    }

    @Test
    public void testGetError1(){
        ReturnObject Test1 = new ReturnObjectImpl(StringTest);
        ErrorMessage expected = ErrorMessage.NO_ERROR;
        ErrorMessage output = Test1.getError();
        assertEquals(expected, output);
    }

    @Test
    public void testGetError2(){
        ReturnObject Test1 = new ReturnObjectImpl(StringTest);
        Object expected = "Test";
        Object output = Test1.getReturnValue();
        assertEquals(expected, output);
    }

    @Test
    public void testGetError3(){
        ReturnObject Test1 = new ReturnObjectImpl(ErrorTest);
        ErrorMessage expected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
        ErrorMessage output = Test1.getError();
        assertEquals(expected, output);
    }

    @Test
    public void testGetError4(){
        ReturnObject Test1 = new ReturnObjectImpl(ErrorTest);
        Object expected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
        Object output = Test1.getReturnValue();
        assertEquals(expected, output);
    }

}