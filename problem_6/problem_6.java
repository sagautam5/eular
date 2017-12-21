class problem_6{
    public static void main(String[] args){
        
        int num = 100;
        
        int sqa_of_sum = num*num*(num+1)*(num+1)/4;

        int sum_of_sqa = num*(2*num+1)*(num+1)/6;

        int difference = sqa_of_sum-sum_of_sqa;

        System.out.println("Difference: "+ difference);
    
    }
}
