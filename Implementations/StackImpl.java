package Implementations;


import cw3.AbstractStack;
import cw3.List;
import cw3.ReturnObject;
import cw3.ErrorMessage;

/**
 * Created by digibrose on 19/12/2014.
 */
public class StackImpl extends AbstractStack {

    /**
     * constructor method that takes parameter List and applies it to the parent class
     *
     * @param list input list to make stack from
     */

    public StackImpl(List list) {

            super(list);
    }

    /**
     * method that returns boolean of whether stack is empty
     * @return boolean
     */

    @Override
    public boolean isEmpty() {
        if (nullTest()){return true;}
        return internalList.isEmpty();
    }

    /**
     * Method to calculate size of stack
     * @return result of size method of list instance from parent class
     */

    @Override
    public int size() {
        if (nullTest()){return 0;}
        return internalList.size();
    }

    /**
     * Method to add a new element to the top of the stack
     * @param item the new item to be added
     */

    @Override
    public void push(Object item) {
        if (!nullTest()) {
            internalList.add(0, item);
        }
    }

    /**
     * Method that allows you to see the top element of a stack
     * @return ReturnObject top
     */

    @Override
    public ReturnObject top() {
        if (nullTest()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        if (internalList.isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        else {
            return new ReturnObjectImpl(internalList.get(0).getReturnValue());
        }
    }

    /**
     * Method to remove the top element of the stack
     * @return ReturnObject top the object at the top of the stack
     */

    @Override
    public ReturnObject pop() {
        if (nullTest()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        if (internalList.isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        else {
            return new ReturnObjectImpl(internalList.remove(0).getReturnValue());
        }
    }

    /**
     * Method to check whether the Stack was set up incorrectly with a null list
     * @return boolean
     */

    private boolean nullTest(){
        return internalList == null;
    }
}
