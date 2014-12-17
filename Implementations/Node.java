package Implementations;

/**
 * Created by digibrose on 16/12/2014.
 */
public class Node {

    private Object NodeObject = null;
    private Node NextNode = null;

    public Object getObject(){
        return NodeObject;
    }

    public Node getNextNode(){
        return NextNode;
    }

    public void setObject(Object set){
        NodeObject = set;
    }

    public void setNextNode(Node set){
        NextNode = set;
    }




}
