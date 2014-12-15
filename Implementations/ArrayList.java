package Implementations;
import Interfaces.List;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by digibrose on 10/12/2014.
 */
public class ArrayList implements List {

    private Object[] Array = new int[INIIALSIZE];
    private static int INIIALSIZE = 5;

    private int size = INIIALSIZE;

    /**
     * Constructor Method
     */
    public ArrayList(){
    }

    @Override
    public boolean isEmpty() {
        if (Array[0] == null){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ReturnObject get(int index) {
        if (index < size ){
            if (Array[index] != null){
                ReturnObject get = new ReturnObjectImpl(Array[index]);
                return get;
            }
            else {
                ReturnObject get = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
            }
        }
        else{
            ReturnObject get = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
    }

    @Override
    public ReturnObject remove(int index) {
        return null;
    }

    @Override
    public ReturnObject add(int index, Object item) {
        return null;
    }

    @Override
    public ReturnObject add(Object item) {
        return null;
    }
}
