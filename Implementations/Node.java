package Implementations;

/**
 * Created by digibrose on 16/12/2014.
 */
public class Node {

    /**
     * Container Object to store Instance and Node Instance to point to next node in the list
     */

    private Object NodeObject = null;
    private Node NextNode = null;

    /**
     * Constructor Method
     */

    public Node(){

    }

    /**
     * Constructor Method with Object to put into NodeObject
     * @param obj
     */

    public Node(Object obj){
        setObject(obj);
    }

    /**
     * Method to return Object placed in NodeObject
     * @return NodeObject
     */

    public Object getObject(){
        return NodeObject;
    }

    /**
     * Method to return Next Node
     * @return NextNode
     */


    public Node getNextNode(){
        return NextNode;
    }

    /**
     * Method to set new object for NodeObject
     * @param set
     */

    public void setObject(Object set){
        NodeObject = set;
    }

    /**
     * Method to set new NextNode
     * @param set
     */


    public void setNextNode(Node set){
        NextNode = set;
    }

}
