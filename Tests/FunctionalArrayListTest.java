package Tests;
import Implementations.FunctionalArrayList;
import Implementations.ArrayList;
import Interfaces.FunctionalList;

/**
 * Created by digibrose on 18/12/2014.
 */
public class FunctionalArrayListTest {

    public static void main(String[] args) {

        FunctionalArrayList TestFL = new FunctionalArrayList();


        System.out.println(TestFL.isEmpty());
        System.out.println(TestFL.size());

        String A = "A";
        String B = "B";
        String C = "C";

        System.out.println(TestFL.add(A).getReturnValue());
        System.out.println(TestFL.add(B).getReturnValue());
        System.out.println(TestFL.add(C).getReturnValue());

        System.out.println(TestFL.get(0).getReturnValue());
        System.out.println(TestFL.get(1).getReturnValue());
        System.out.println(TestFL.get(2).getReturnValue());
        System.out.println(TestFL.get(3).getReturnValue());

        System.out.println(TestFL.head().getReturnValue());

        FunctionalList FL2 = TestFL.rest();

        System.out.println(FL2.get(0).getReturnValue());
        System.out.println(FL2.get(1).getReturnValue());
        System.out.println(FL2.get(2).getReturnValue());

    }


}
