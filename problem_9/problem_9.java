class problem_9{
    public static void main(String[] args){

        for(int a=1;a<1000;a++){
            for(int b=1; b<1000;b++){
                for(int c=1; c<1000; c++){
                    if(a+b+c==1000 && a<b && b<c){
                        if(a*a+b*b == c*c){
                            System.out.println("Values: "+a+" "+b+" "+c);
                            System.out.println("Product: "+a*b*c);
                        }
                    }
                }
            }
        }
    }
}
