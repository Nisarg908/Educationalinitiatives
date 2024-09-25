package classes;

import java.util.*;

public class SampleHouse{
    private static Map<Integer,House> houseDictionary = new HashMap<Integer,House>();

    static{
        houseDictionary.put(2,new TwoBHK());
        houseDictionary.put(3,new ThreeBHK());
    }

    public static House getHouse(int id){
        return (House) houseDictionary.get(id).clone();
    }
}