import java.lang.*;

class problem_7{

    public static int checkPrime(int num){
        
        int is_prime = 1;

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                is_prime = 0;
            }
        }

        return is_prime;
    }

    public static void main(String[] args){
      
        int count = 1;
        int first = 2;
        int largest = 2;
        while(count <= 10001){
            first++;
            if(checkPrime(first)==1){
                largest = first;
                count++;
            }
        }

        System.out.println("10001 th prime : "+largest);
        
    }
}
