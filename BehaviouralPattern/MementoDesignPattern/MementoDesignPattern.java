import java.util.*;
import classes.*;

public class MementoDesignPattern {
    public static void main(String[] args) {
        OriginatorObject o1 = new OriginatorObject(20, 10);
        // generally after this we call business methods of the class
        // called operateMachine
        // store the required state using saveObjectState() which gives a memento
        // store the memento in caretaker
        // change the state of machine using getter and setter methods like 3 times
        // then try to restore the memento initial state using getMementoObject of caretaker and then send it to restoreObjectState of Originator
        System.out.println("Initial State");
        o1.operateMachine();
        CareTaker c1 = new CareTaker();
        c1.addMementoObject(o1.saveObjectState());
        o1.setTemperature(0);
        o1.setVolume(0);
        o1.operateMachine();
        o1.setTemperature(40);
        o1.setVolume(20);
        o1.operateMachine();
        System.out.println("Restoring the Previous state");
        o1.restoreObjectState(c1.getMementoObject(0));
        o1.operateMachine();
    }
}
