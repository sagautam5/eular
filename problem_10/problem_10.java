class problem_10{

    public static int checkPrime(int num){
        
        int is_prime = 1;
        for(int i=2;i<=Math.sqrt(num); i++){
            if(num % i == 0){
                is_prime = 0;
            }
        }

        return is_prime;
    }

    public static void main(String[] args){

        long sum = 0;
        long boundary = 2000000;

        for(int a=2; a<boundary; a++){
            if(checkPrime(a)==1){
                sum = sum + a;
            }
        }

        System.out.println("Sum of primes below 2 millon: "+sum);
    }
}
