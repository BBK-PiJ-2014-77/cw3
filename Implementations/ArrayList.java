package Implementations;
import Interfaces.List;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by digibrose on 10/12/2014.
 */
public class ArrayList implements List {

    /**
     * create instance array and set initial size and set freespace counter to 0
     */

    private static int INITALSIZE = 5;
    private Object[] Array = new Object[INITALSIZE];
    private int size = INITALSIZE;
    private int freespace = 0;

    /**
     * Constructor Method
     */

    public ArrayList(){
    }

    /**
     * Method to calculate whether Arraylist is empty
     * @return true if list contains no elements
     */


    @Override
    public boolean isEmpty() {
        if (Array[0] == null){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Method to calculate number of elements in list
     * @return freespace counter for number of elements in list
     */

    @Override
    public int size() {
        return freespace;
    }

    /**
     *
     * @param index the position in the list of the item to be retrieved
     * @return ReturnObject get either element from the array indicated by index or a suitable error message.
     */


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

    /**
     *
     * returns the object called for but then cuts it out of the array and reduces the counter freespace by 1
     *
     * @param index the position in the list of the item to be removed
     * @return ReturnObject remove indicated by index
     */

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

    /**
     *
     * adds a new object to the list at the position requested by the index parameter
     *
     * @param index the position at which the item should be inserted in
     *              the list
     * @param item the object to insert into the list
     * @return ReturnObject add which is an error message of either "out of bounds" if bigger than present array or
     * no error
     */

    @Override
    public ReturnObject add(int index, Object item) {
        if (freespace == size -2){
            increaseSpace();
        }
        if (index >= freespace){
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            return add;
        }
        if (item == null){
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
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

    /**
     * adds a new object to the list
     *
     *
     * @param item the object to insert into the list
     * @return
     */

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
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
            return add;
        }
    }

    /**
     * method to increase space in the array
     */

    private void increaseSpace(){
        Object NA[] = new Object[size * 2];
        for (int i = 0; i < size; i++) {
            NA[i] = Array[i];

        }
        this.Array = NA;
        size = size * 2;
    }
}
