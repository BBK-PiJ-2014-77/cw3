package Implementations;

import cw3.ImprovedStack;
import cw3.List;
import cw3.ReturnObject;
import cw3.Stack;

/**
 * Created by digibrose on 19/12/2014.
 */
public class ImprovedStackImpl implements ImprovedStack {

    /**
     * Instance of a Stack for use by class
     */

    private Stack ImpStack;

    /**
     * Constructor method which takes a list and uses it to create the stack
     * @param List
     */

    public ImprovedStackImpl(List List){
        ImpStack = new StackImpl(List);
    }

    /**
     * Method to reverse the stack
     * @return ImprovedStack NewStack a new instance of the stack it also refills the old stack
     */

    @Override
    public ImprovedStack reverse() {
        LinkedList NewList = new LinkedList();
        ImprovedStack NewStack = new ImprovedStackImpl(NewList);
        while (!ImpStack.isEmpty()){
            NewStack.push(ImpStack.pop().getReturnValue());
        }
       for (int i = 0; i < NewList.size(); i++){
           ImpStack.push(NewList.get(i).getReturnValue());
       }
        return NewStack;
    }

    /**
     * Method to check through a stack and remove an object keeps the same instance of the stack
     *
     * @param object the object to remove
     */

    @Override
    public void remove(Object object) {
        LinkedList NewList = new LinkedList();
        ImprovedStack NewStack = new ImprovedStackImpl(NewList);
        while (!ImpStack.isEmpty()){
            if (!ImpStack.top().getReturnValue().equals(object)) {
                NewStack.push(ImpStack.pop().getReturnValue());
            }
            else {
                ImpStack.pop();
            }
        }
        ImprovedStack ReturnStack = NewStack.reverse();
        ImpStack = ReturnStack;
    }

    /**
     * method using the stacks implementation of isEmpty()
     * @return
     */

    @Override
    public boolean isEmpty() {
        return ImpStack.isEmpty();
    }

    /**
     * method using the stacks implementation of size()
     * @return
     */

    @Override
    public int size() {
        return ImpStack.size();
    }

    /**
     * method using the stacks implementation of push()
     * @param item the new item to be added
     */

    @Override
    public void push(Object item) {
        ImpStack.push(item);
    }

    /**
     * method using the stacks implementation of top()
     * @return
     */

    @Override
    public ReturnObject top() {
        return ImpStack.top();
    }

    /**
     * method using the stacks implementatio of pop()
     * @return
     */

    @Override
    public ReturnObject pop() {
        return ImpStack.pop();
    }
}
