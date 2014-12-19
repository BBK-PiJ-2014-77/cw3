package Implementations;

import Interfaces.FunctionalList;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by digibrose on 18/12/2014.
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList{

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

