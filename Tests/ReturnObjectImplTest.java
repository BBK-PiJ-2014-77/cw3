package Tests;

import Implementations.ReturnObjectImpl;
import Error.ErrorMessage;

/**
 * Created by digibrose on 11/12/2014.
 */
public class ReturnObjectImplTest {

    public static void main(String[] args){

        String StringTest = "Test";
        ErrorMessage ErrorTest = ErrorMessage.INDEX_OUT_OF_BOUNDS;

        ReturnObjectImpl Test1 = new ReturnObjectImpl(StringTest);
        ReturnObjectImpl ErrorTest1 = new ReturnObjectImpl(ErrorTest);

        System.out.println(Test1.hasError());
        System.out.println(Test1.getError());
        System.out.println(Test1.getReturnValue());

        System.out.println(ErrorTest1.hasError());
        System.out.println(ErrorTest1.getError());
        System.out.println(ErrorTest1.getReturnValue());





    }

}
