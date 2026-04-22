class KthDigitWithPower {
    public static void main(String[] args) {
       int A = 5, B=4, k=3;
    
     long power=(long)Math.pow(A,B);
     System.out.println(power); 
     long i=1;
     while(power>0){
        long a=power%10;
        if(i==k){
            System.out.println(a);
        }
        i++;
        power=power/10; 

        }
     }
       
    }


