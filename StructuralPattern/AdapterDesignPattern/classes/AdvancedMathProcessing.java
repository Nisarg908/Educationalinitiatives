package classes;

import java.util.*;

//Service Library->Adaptee
public class AdvancedMathProcessing{
    public void calculateAverage(List<Integer> ls){
        int sum =0;
            for (Integer i : ls){
                sum+=i;
            }
    System.out.println("Average: "+sum/ls.size());
    }
    public void sortData(List<Integer> ls){
        ls.sort(Integer::compareTo);
        System.out.println(ls);
    }
    public int searchData(List<Integer> ls, int element){
        return ls.indexOf(element);
    }
    public void replace(List<Integer> ls, int key, int newValue){
        int i = ls.indexOf(key);
        if(i != -1){
            ls.set(i,newValue);
        }
    }
    public List<Integer> copyListData(List<Integer> ls){
        List<Integer> ls1 = new ArrayList<Integer>(ls);
        return ls1;
    }
}
