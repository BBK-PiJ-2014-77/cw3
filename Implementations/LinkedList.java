package Implementations;

import Interfaces.List;
import Interfaces.ReturnObject;
import Error.ErrorMessage;

/**
 * Created by digibrose on 16/12/2014.
 */
public class LinkedList implements List {

    /**
     * Instance of node class to wrap around the list object
     */

    private Node First = new Node();

    /**
     * Constructor Method
     */

    public LinkedList(){

    }

    /**
     * Method to calculate whether Arraylist is empty
     * @return true if list contains no elements
     */

    public boolean isEmpty() {
        if (First.getObject() == null){
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * Method to calculate number of elements in list
     * @return  number of elements in list
     */

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

    /**
     *Method to return the object at the given position
     * @param index the position in the list of the item to be retrieved
     * @return ReturnObject get either object indicated by index or a suitable error message.
     */

    @Override
    public ReturnObject get(int index) {
        if (index >= 0 && index < size()) {
            Node step = steper(index);
            ReturnObject get = new ReturnObjectImpl(step.getObject());
            return get;
        }
        else {
            ReturnObject get = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            return get;
        }
    }

    /**
     * method to remove an object at the given position
     * @param index the position in the list of the item to be removed
     * @return ReturnObject return the object which is to be removed or a suitable error message
     */
    @Override
    public ReturnObject remove(int index) {
        if (isEmpty()){
            ReturnObject remove = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
            return remove;
        }
        else if (index >= 0 && index < size()){
            Node step = steper(index);
            ReturnObject remove = new ReturnObjectImpl(step.getObject());
            if (index == 0){
                First = step.getNextNode();
                if (First == null){
                    First = new Node();
                }
            }
            else {
                steper(index - 1).setNextNode(step.getNextNode());
            }

            return remove;
        }
        else {
            ReturnObject remove = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            return remove;
        }
    }

    /**
     * method to add an object into the list at a specific point
     * @param index the position at which the item should be inserted in
     *              the list
     * @param item the object to insert into the list
     * @return A ReturnObject either showing an error message or no Error
     */

    @Override
    public ReturnObject add(int index, Object item) {
        if (item == null){
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
            return add;
        }
        if (index == 0){
            Node newNode = new Node(item);
            if (!isEmpty()){
            newNode.setNextNode(First);
            }
            First = newNode;
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
            return add;
        }
        else if (index >= 1 && index < size()){
            Node newNode = new Node(item);
            newNode.setNextNode(steper(index));
            steper(index -1).setNextNode(newNode);
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
            return add;
        }
        else {
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            return add;
        }
    }

    /**
     * A method to add a new object to the list
     * @param item the object to insert into the list
     * @return ReturnObject containing either an error message or "No Error"
     */

    @Override
    public ReturnObject add(Object item) {
        if (item == null){
            ReturnObject add = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
            return add;
        }
        if (isEmpty()) {
            First.setObject(item);
        } else {
            Node add = First;
            while (add.getNextNode() != null) {
                add = add.getNextNode();
            }
            Node newNode = new Node(item);
            add.setNextNode(newNode);

        }
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

    /**
     * a private method to step through the list to the required point and then return the next node
     * @param index
     * @return Node step the next node along from position indicated by index
     */

    private Node steper(int index){
        Node step = First;
        for (int i = 0; i < index; i++) {
            step = step.getNextNode();
        }
        return step;
    }

}
