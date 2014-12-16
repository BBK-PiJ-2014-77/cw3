package Implementations;
import Interfaces.List;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by digibrose on 10/12/2014.
 */
public class ArrayList implements List {

    private Object[] Array = new Object[INIIALSIZE];
    private static int INIIALSIZE = 5;

    private int size = INIIALSIZE;
    private int freespace = 0;

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
        return freespace;
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
                return get;
            }
        }
        else{
            ReturnObject get = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            return  get;
        }
    }

    @Override
    public ReturnObject remove(int index) {
        if (index > freespace) {
            ReturnObject remove = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            return remove;
        } else {
            ReturnObject remove = new ReturnObjectImpl(Array[index]);
            for (int i = index; i < freespace; i++) {
                Array[i] = Array[i + 1];
            }
            freespace = freespace - 1;
            return remove;
        }
    }

    @Override
    public ReturnObject add(int index, Object item) {
        if (freespace == size -2){
            increaseSpace();
        }
        if (index >= freespace){
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            return add;
        }
        for (int i = freespace; i >= index; i--){
            Array[i+1]= Array[i];
        }
        Array[index] = item;
        freespace++;
        ReturnObject add = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        return add;
    }

    @Override
    public ReturnObject add(Object item) {
        if (freespace == size - 2) {
            increaseSpace();
        }
        if (item != null) {
            Array[freespace] = item;
            freespace++;
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
            return add;
        }
        else {
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
            return add;
        }
    }

    private void increaseSpace(){
        Object NA[] = new Object[size * 2];
        for (int i = 0; i < size; i++) {
            NA[i] = Array[i];

        }
        this.Array = NA;
        size = size * 2;
    }
}
