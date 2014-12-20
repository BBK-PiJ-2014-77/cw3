package Tests;

import Implementations.LinkedList;
import Implementations.ImprovedStackImpl;
import Interfaces.ImprovedStack;
import Interfaces.List;

/**
 * Created by digibrose on 19/12/2014.
 */
public class ImprovedStackImplTest {

    public static void main(String[] args) {

        List SL = new LinkedList();

        ImprovedStack II = new ImprovedStackImpl(SL);

        System.out.println(II.isEmpty());
        System.out.println(II.size());

        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";
        String G = "G";
        String H = "H";
        String I = "I";

        II.push(A);
        II.push(B);
        II.push(C);
        II.push(D);

        ImprovedStack II2 = II.reverse();
        II2.remove(B);


        while (!II2.isEmpty()) {
            System.out.println(II2.top().getReturnValue());
            System.out.println(II2.pop().getReturnValue());
        }

        System.out.println(II2.top().getReturnValue());
        System.out.println(II2.pop().getReturnValue());



        while (!II.isEmpty()) {
            System.out.println(II.top().getReturnValue());
            System.out.println(II.pop().getReturnValue());
        }

        System.out.println(II.top().getReturnValue());
        System.out.println(II.pop().getReturnValue());

    }

}
