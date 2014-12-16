package Tests;

import Implementations.ArrayList;

/**
 * Created by digibrose on 15/12/2014.
 */
public class ArrayListTest {

    public static void main(String[] args){

        ArrayList TestAL = new ArrayList();

        System.out.println(TestAL.isEmpty());
        System.out.println(TestAL.size());

        String A = "A";
        String B = "B";
        String C = "C";

        System.out.println(TestAL.add(A).getReturnValue());
        System.out.println(TestAL.add(B).getReturnValue());
        System.out.println(TestAL.add(C).getReturnValue());

        System.out.println(TestAL.get(0).getReturnValue());
        System.out.println(TestAL.get(1).getReturnValue());
        System.out.println(TestAL.get(2).getReturnValue());
        System.out.println(TestAL.get(3).getReturnValue());

        String D = "D";
        String E = "E";
        String F = "F";

        System.out.println(TestAL.add(D).getReturnValue());
        System.out.println(TestAL.add(E).getReturnValue());
        System.out.println(TestAL.add(F).getReturnValue());

        System.out.println(TestAL.size());

        String G = "G";
        String H = "H";
        String I = "I";

        System.out.println(TestAL.get(0).getReturnValue());
        System.out.println(TestAL.get(6).getReturnValue());
        System.out.println(TestAL.get(20).getReturnValue());

        System.out.println(TestAL.add(G).getReturnValue());
        System.out.println(TestAL.size());
        System.out.println(TestAL.add(H).getReturnValue());
        System.out.println(TestAL.size());

        System.out.println(TestAL.remove(7).getReturnValue());
        System.out.println(TestAL.remove(2).getReturnValue());
        System.out.println(TestAL.remove(2).getReturnValue());
        System.out.println(TestAL.remove(7).getReturnValue());


    }

}
