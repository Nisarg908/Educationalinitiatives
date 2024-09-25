package classes;

public class BasicMathProcessing implements MathProcessing{
    @Override
    public void mathFunction(String type, Integer[] data) {
        if(type.equalsIgnoreCase("add")){
            int sum =0;
            for (Integer i : data){
                sum+=i;
            }
            System.out.println("Sum: "+sum);
        }
        else if(type.equalsIgnoreCase("multiplication")){
            int mul =1;
            for(int i : data){
                mul*=i;
            }
            System.out.println("Multiplication: "+mul);
        }
        else{
            MathProcessing md = new MathAdapter();
            md.mathFunction(type, data);
        }
        
    }
}