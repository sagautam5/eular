class problem_2{
    public static void main(String[] args){
        int first = 1;
        int second = 2;
        
        int sum = 0;
        int temp = 0;

        while(second < 4000000){
            if(second % 2 == 0){
                sum = sum + second;
            }
            temp = second + first;
            first = second;
            second = temp;
            temp = 0;
        }

        System.out.println("SUM: "+sum);

    }
}
