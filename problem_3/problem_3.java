import java.util.*;

class problem_3{

    public static int checkPrime(int num){

        int is_prime = 1;
        for(int i=2; i<Math.sqrt(num); i++){
            if(num % i == 0){
                is_prime = 0;
            }
        }

        return is_prime;
    }
    public static void main(String[] args){
        
        long number = 600851475143L;        
        int largest = 2;

        for(int i=2; i<Math.sqrt(number); i++){
            if(number % i == 0){
                if(checkPrime(i)==1){
                    largest = i;
                }
            }
        }

        System.out.println("Largest Prime: "+ largest);
    }
}
