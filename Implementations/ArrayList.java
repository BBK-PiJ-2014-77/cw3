package Implementations;
import Interfaces.List;
import Interfaces.ReturnObject;

/**
 * Created by digibrose on 10/12/2014.
 */
public class ArrayList implements List {

    int[] Array = null;

    /**
     * Constructor Method
     */
    public ArrayList(int[] SetArray){
        this.Array = SetArray;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public ReturnObject get(int index) {
        return null;
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
