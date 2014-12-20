package Implementations;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by ubcg49ac on 09/12/2014.  Implementation class for the ReturnObject interface
 * It contains either an object or an error message depending how it is created.  The user can then check for an error
 * return the error (No Error is returned if there is no error) or return the object (the error is returned if no object).
 */

public class ReturnObjectImpl implements ReturnObject {

    /**
     * Data structures one for object storage, one for errors and one boolean to flag whether there has been an error.
     */

    private Object ReturnObject;

    private ErrorMessage ErrorState;

    private boolean ErrorOccurred;

    /**
     * Constructor Methods
     * First for when given correct Object second for when given an error overloading the constructor
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
     * @return boolean true is error has occurred.
     */

    @Override
    public boolean hasError() {
        if (ErrorOccurred){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * implementation of the getError method which checks with hasError and returns either no Error or the error state
     * @return an Error Message
     */

    @Override
    public ErrorMessage getError() {

        if (!this.hasError()){
            return  ErrorMessage.NO_ERROR;
        }
        else {
            return ErrorState;
        }
    }

    /**
     * implementation of the getError method which checks whether there has been an error and returns either the error
     * or the object;
     * @return the stored object or an error if one has occurred
     */

    @Override
    public Object getReturnValue() {
        if (hasError()){
            return getError();
        }
        else {
            return ReturnObject;
        }
    }
}
