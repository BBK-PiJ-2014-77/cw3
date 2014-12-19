package Implementations;

import Interfaces.ReturnObject;
import Interfaces.SampleableList;
import Implementations.LinkedList;
import Error.ErrorMessage;

/**
 * Created by digibrose on 18/12/2014.
 */
public class SampleableListImpl extends LinkedList implements SampleableList {


        @Override
        public SampleableList sample() {
            if (isEmpty()){
                ReturnObject sp = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
                SampleableListImpl sample = new SampleableListImpl();
                sample.add(sp);
                return sample;
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





