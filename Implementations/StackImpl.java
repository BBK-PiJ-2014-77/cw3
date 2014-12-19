package Implementations;


import AbsClasses.AbstractStack;
import Interfaces.List;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by digibrose on 19/12/2014.
 */
public class StackImpl extends AbstractStack {


    public StackImpl(List list) {
        super(list);
    }

    @Override
    public boolean isEmpty() {
        if (internalList.isEmpty()){
            return true;
        }
        else {
            return  false;
        }
    }

    @Override
    public int size() {
        return internalList.size();
    }

    @Override
    public void push(Object item) {
        internalList.add(0, item);
    }

    @Override
    public ReturnObject top() {
        if (internalList.isEmpty()){
            ReturnObject top = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
            return top;
        }
        else {
            ReturnObject top = new ReturnObjectImpl(internalList.get(0).getReturnValue());
            return top;
        }
    }

    @Override
    public ReturnObject pop() {
        if (internalList.isEmpty()){
            ReturnObject top = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
            return top;
        }
        else {
            ReturnObject top = new ReturnObjectImpl(internalList.remove(0).getReturnValue());
            return top;
        }
    }
}
