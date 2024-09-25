import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import classes.*;

/*Client - Interface - MathProcessing having method - public mathFunction(String type, Integer[] data)
  class BasicMathProcessing implements MathProcessing{}
  class AdvancedMathProcessing - public void calculateAverage(List<Integer> ls)
                                 public void sortData(List<Integer> ls)
                                 public int searchData(List<Integer> ls)
                                 public void replace(List<Integer> ls, int key, int newValue)
                                 public List copyListData(List<Integer> ls)
    class MathAdapter implements MathProcessing

  MathDataProcessing(Client Interface) - public void processData(String type, Integer[] array)
  MathDataCalculation(Adaptee - Library ready to use) - public int calculateAverage(List<Integer)
                                                        public void sortData(List<Integer>)
                                                        
  MathAdapter(Adapter) - Arrays.aslist
 */

//Client
public class AdapterPatternCalculator {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 3, 4, 2};
        MathProcessing mathProcessing = new BasicMathProcessing();
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        mathProcessing.mathFunction(choice, array);
        // mathProcessing.processData("add", array);
        // mathProcessing.processData("average", array);
        // mathProcessing.processData("sort", array);
        // mathProcessing.processData("search", array);
        // mathProcessing.processData("replace", array);
      }
}
