package Implementations;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by ubcg49ac on 09/12/2014.
 */
public class ReturnObjectImpl implements ReturnObject {

    private Object ReturnObject;

    private ErrorMessage ErrorState;

    private boolean ErrorOccurred;

    /**
     * Constructor Methods
     * First for when given correct Object second for when given an error overloading the constructor
     * @return
     */

    public ReturnObjectImpl(Object ReturnObject){

        this.ReturnObject = ReturnObject;
        this.ErrorOccurred = false;

    }

    public ReturnObjectImpl(ErrorMessage ErrorState){

        this.ErrorState = ErrorState;
        this.ErrorOccurred = true;
    }

    /**
     * implementation of the hasError method which checks which constructor was called
     * @return
     */

    @Override
    public boolean hasError() {
        if (ErrorOccurred == true){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * implementation of the getError method which checks with hasError and returns either no Error or the error state
     * @return
     */

    @Override
    public ErrorMessage getError() {

        if (this.hasError() == false ){
            return  ErrorMessage.NO_ERROR;
        }
        else {
            return ErrorState;
        }
    }

    /**
     * implementation of the getError method which checks whether there has been an error and returns either the error
     * or the object;
     * @return
     */

    @Override
    public Object getReturnValue() {
        if (hasError() == true){
            return getError();
        }
        else {
            return ReturnObject;
        }
    }
}
