import java.lang.*;
import java.util.*;

class problem_5{

    public static int[] convertIntegers(ArrayList<Integer> integers)
    {
            int[] ret = new int[integers.size()];
            for (int i=0; i < ret.length; i++){
                 ret[i] = integers.get(i).intValue();
            }
        return ret;
    }

    public static ArrayList<Integer> primeFactors(int number) {
        int n = number;
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
       }
       return factors;
    }
    
    public static int getMultiplyNumber(int product, int num){
        if(product % num == 0){
            return 1;
        }
        else{
            ArrayList<Integer> number_factors = primeFactors(num);
            ArrayList<Integer> product_factors = primeFactors(product);
            
            int n_size = number_factors.size();
            int p_size = product_factors.size();

            int[] number_array = convertIntegers(number_factors);
            int[] product_array = convertIntegers(product_factors);
             
            for(int i=0; i<n_size; i++){
                for(int j=0; j<p_size; j++){
                    if(number_array[i]==product_array[j]){
                        number_array[i] = 0;
                        product_array[j] = 0;
                    }
                }
            }
            int total = 1;
            for(int factor: number_array){
                if(factor!=0)
                    total = total * factor;
            }
            return total;
        }
    }
    
    public static void main(String[] args){
        
        int number = 20;
        
        int product = 1;
        
        for(int i=2; i<=number; i++){
           int value = getMultiplyNumber(product,i);
           product = product* value;
        }

        System.out.println("Product: "+product);
    }
}
