package Tests;

import Implementations.LinkedList;

/**
 * Created by digibrose on 17/12/2014.
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList TestLL = new LinkedList();

        System.out.println(TestLL.isEmpty());
        System.out.println(TestLL.size());

        String A = "A";
        String B = "B";
        String C = "C";

        System.out.println(TestLL.add(A).getReturnValue());
        System.out.println(TestLL.add(B).getReturnValue());
        System.out.println(TestLL.add(C).getReturnValue());

        System.out.println(TestLL.get(0).getReturnValue());
        System.out.println(TestLL.get(1).getReturnValue());
        System.out.println(TestLL.get(2).getReturnValue());

        System.out.println(TestLL.isEmpty());
        System.out.println(TestLL.size());

        System.out.println(TestLL.get(3).getReturnValue());

    }
}
