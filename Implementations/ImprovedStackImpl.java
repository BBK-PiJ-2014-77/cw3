package Implementations;

import Interfaces.ImprovedStack;
import Interfaces.List;
import Interfaces.ReturnObject;
import Interfaces.Stack;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by digibrose on 19/12/2014.
 */
public class ImprovedStackImpl implements ImprovedStack {

    private Stack ImpStack;

    public ImprovedStackImpl(List List){
        ImpStack = new StackImpl(List);
    }

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

    @Override
    public boolean isEmpty() {
        return ImpStack.isEmpty();
    }

    @Override
    public int size() {
        return ImpStack.size();
    }

    @Override
    public void push(Object item) {
        ImpStack.push(item);
    }

    @Override
    public ReturnObject top() {
        return ImpStack.top();
    }

    @Override
    public ReturnObject pop() {
        return ImpStack.pop();
    }
}
