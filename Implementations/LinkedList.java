package Implementations;

import Interfaces.List;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by digibrose on 16/12/2014.
 */
public class LinkedList implements List {


    Node First = new Node();

    public boolean isEmpty() {
        if (First.getObject() == null){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public int size() {
        if (!isEmpty()) {
            Node SizeCheck = First;
            int i = 1;
            while (SizeCheck.getNextNode() != null) {
                i++;
                SizeCheck = SizeCheck.getNextNode();
            }
            return i;
        }
        else {
            return 0;
        }
    }

    @Override
    public ReturnObject get(int index) {
        if (index < size()) {
            Node step = First;
            for (int i = 0; i < index; i++) {
                step = step.getNextNode();
            }
            ReturnObject get = new ReturnObjectImpl(step.getObject());
            return get;
        }
        else {
            ReturnObject get = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            return get;
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
        if (isEmpty()) {
  //          First = new Node();
            First.setObject(item);
        } else {
            Node add = First;
            while (add.getNextNode() != null) {
                add = add.getNextNode();
            }
            Node newNode = new Node();
            newNode.setObject(item);
            add.setNextNode(newNode);

        }
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

}
