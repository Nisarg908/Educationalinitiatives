package classes;
import java.util.*;

//Adapter
public class MathAdapter implements MathProcessing{
    Scanner sc = new Scanner(System.in);
    //reference of Adaptee
    AdvancedMathProcessing adv = new AdvancedMathProcessing();

    @Override
    public void mathFunction(String type, Integer[] data) {
        if(type.equalsIgnoreCase("average")){
            adv.calculateAverage(Arrays.asList(data));
        }
        else if(type.equalsIgnoreCase("sort")){
            adv.sortData(Arrays.asList(data));
        }
        else if(type.equalsIgnoreCase("search")){
            System.out.println("Enter element to be searched: ");
            int key = sc.nextInt();
            System.out.println("Found at index :"+adv.searchData(Arrays.asList(data),key));
            
        }
        else if(type.equalsIgnoreCase("replace")){
            System.out.println("Enter element to be replaced: ");
            int key = sc.nextInt();
            System.out.println("Enter the new element: ");
            int newValue = sc.nextInt();
            adv.replace(Arrays.asList(data), key, newValue);
            System.out.println("Replaced !!");
        }
        else if(type.equalsIgnoreCase("copy")){
            List<Integer> copylist = new ArrayList<Integer>();
            copylist = adv.copyListData(Arrays.asList(data));
            System.out.println("Copied!!");
        }
    }
    
}

