package Implementations;

import Interfaces.FunctionalList;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by digibrose on 18/12/2014.
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList{


    /**
     * Method to return the first entry into a list
     * @return ReturnObject head
     */

    @Override
    public ReturnObject head() {
        if (isEmpty()) {
            ReturnObject head = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
            return head;
        }
        else {
            ReturnObject head = new ReturnObjectImpl(get(0).getReturnValue());
            return head;
        }
    }

    /**
     * Method to return a new FunctionaList that contains everything except the initial entry
     * @return FunctionalLinkedList rest
     */

    @Override
    public FunctionalList rest() {
        FunctionalLinkedList rest = new FunctionalLinkedList();
        for (int i = 0; i < size(); i++){
            rest.add(this.get(i).getReturnValue());
        }
        rest.remove(0);
        return rest;
    }
}

