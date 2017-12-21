class problem_4{

    public static int isPalindrom(int num){
        
        int is_palindrom = 1;

        int reverse = 0;
        int original = num;
        while(num>0){
            int reminder = num % 10;
            num = num/10;
            if(num>0){
                reverse = (reverse+reminder)*10;
            }else{
                reverse = (reverse+reminder);
            }
        }

        if(original == reverse){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){

        int upper_limit = 999;
        int lower_limit = 100;

        int largest = lower_limit;

        for(int i=lower_limit; i<=upper_limit; i++){
            for(int j=lower_limit; j<=upper_limit; j++){
                int value = i*j; 
                if(isPalindrom(value)==1){
                    if(largest<value){
                        largest = value;
                    }
                }
            }
        }

        System.out.println("Largest Palindrom: "+largest);
    }
}
