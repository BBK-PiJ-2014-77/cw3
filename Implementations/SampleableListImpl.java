package Implementations;


import Interfaces.SampleableList;


/**
 * Created by digibrose on 18/12/2014.
 */
public class SampleableListImpl extends LinkedList implements SampleableList {

    /**
     * Method to return a sample of the list of odd elements or an empty list if empty
     *
     * @return SampleableList sample containing a sample of the 1st 3rd etc elements in a list or an empty list
     */
        @Override
        public SampleableList sample() {
            if (isEmpty()){
                return new SampleableListImpl();
            }
            else {
                SampleableList sample = new SampleableListImpl();
                for (int i=0; i < size(); i++){
                    if (i%2 == 0){
                        sample.add(this.get(i).getReturnValue());
                    }
                }
                return sample;
            }
        }
    }





