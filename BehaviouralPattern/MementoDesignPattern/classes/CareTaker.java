package classes;

import java.util.*;

// Single responsibility rule each object/class given one responisibility in oop
public class CareTaker {
    List<MementoObject> lm = new ArrayList<MementoObject>();
    public void addMementoObject(MementoObject m) {
        lm.add(m);
    }
    public MementoObject getMementoObject(int i) {
        return lm.get(i);
    }
}