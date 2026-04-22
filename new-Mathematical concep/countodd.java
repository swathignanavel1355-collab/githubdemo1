import java.util.Scanner;
class countodd {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
       int count=0;
        while(n>0){
        int ld=n%10;
        if(ld%2!=0){
        count=count+1;}
        if(n==ld){
         System.out.println(ld);
  }
            n=n/10;
        }
          System.out.println(count);
        
        }
        }