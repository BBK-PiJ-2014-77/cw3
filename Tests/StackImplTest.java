package Tests;

import Implementations.LinkedList;
import Implementations.StackImpl;
import cw3.List;

/**
 * Created by digibrose on 19/12/2014.
 */
public class StackImplTest {

    public static void main(String[] args) {

        List SL0 = null;

        StackImpl SI1 = new StackImpl(SL0);

        System.out.println(SI1.isEmpty());
        System.out.println(SI1.size());
        System.out.println(SI1.top().getReturnValue());

        List SL = new LinkedList();

        StackImpl SI = new StackImpl(SL);

        System.out.println(SI.isEmpty());
        System.out.println(SI.size());

        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";
        String G = "G";
        String H = "H";
        String I = "I";

        SI.push(A);
        SI.push(B);
        SI.push(C);
        SI.push(D);


        while (!SI.isEmpty()) {
            System.out.println(SI.top().getReturnValue());
            System.out.println(SI.pop().getReturnValue());
        }

        System.out.println(SI.top().getReturnValue());
        System.out.println(SI.pop().getReturnValue());

    }
}
