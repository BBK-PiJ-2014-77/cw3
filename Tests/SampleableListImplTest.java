package Tests;

import Implementations.SampleableListImpl;
import Interfaces.SampleableList;

/**
 * Created by digibrose on 19/12/2014.
 */
public class SampleableListImplTest {

    public static void main(String[] args) {

        SampleableListImpl SL = new SampleableListImpl();


        System.out.println(SL.isEmpty());
        System.out.println(SL.size());

        System.out.println(SL.sample().isEmpty());

        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";
        String G = "G";
        String H = "H";
        String I = "I";

        System.out.println(SL.add(A).getReturnValue());
        System.out.println(SL.add(B).getReturnValue());
        System.out.println(SL.add(C).getReturnValue());
        System.out.println(SL.add(D).getReturnValue());
        System.out.println(SL.add(E).getReturnValue());
        System.out.println(SL.add(F).getReturnValue());
        System.out.println(SL.add(G).getReturnValue());
        System.out.println(SL.add(H).getReturnValue());
        System.out.println(SL.add(I).getReturnValue());

        System.out.println(SL.get(0).getReturnValue());
        System.out.println(SL.get(1).getReturnValue());
        System.out.println(SL.get(2).getReturnValue());
        System.out.println(SL.get(3).getReturnValue());
        System.out.println(SL.get(4).getReturnValue());
        System.out.println(SL.get(5).getReturnValue());
        System.out.println(SL.get(6).getReturnValue());
        System.out.println(SL.get(7).getReturnValue());
        System.out.println(SL.get(8).getReturnValue());
        System.out.println(SL.get(9).getReturnValue());
        System.out.println(SL.get(10).getReturnValue());
        System.out.println(SL.get(11).getReturnValue());


        SampleableList SL2 = SL.sample();

        for (int i = 0; i < SL2.size(); i++) {
            System.out.println(SL2.get(i).getReturnValue());
        }
    }

}
