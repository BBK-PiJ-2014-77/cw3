package Tests;

import Implementations.FunctionalLinkedList;
import Interfaces.FunctionalList;

/**
 * Created by digibrose on 18/12/2014.
 */
public class FunciotnalLinkedListTest {

    public static void main(String[] args) {

        FunctionalLinkedList TestFLL = new FunctionalLinkedList();


        System.out.println(TestFLL.isEmpty());
        System.out.println(TestFLL.size());

        String A = "A";
        String B = "B";
        String C = "C";

        System.out.println(TestFLL.add(A).getReturnValue());
        System.out.println(TestFLL.add(B).getReturnValue());
        System.out.println(TestFLL.add(C).getReturnValue());

        System.out.println(TestFLL.get(0).getReturnValue());
        System.out.println(TestFLL.get(1).getReturnValue());
        System.out.println(TestFLL.get(2).getReturnValue());
        System.out.println(TestFLL.get(3).getReturnValue());

        System.out.println(TestFLL.head().getReturnValue());

        FunctionalList FL2 = TestFLL.rest();

        System.out.println(FL2.get(0).getReturnValue());
        System.out.println(FL2.get(1).getReturnValue());
        System.out.println(FL2.get(2).getReturnValue());

    }



}
