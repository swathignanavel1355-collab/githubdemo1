import java.util.Scanner;
class firstdigit {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        while(n>0){
        int a=n%10;
        System.out.println(a);
        n=n/10;
        if(n==0){
            System.out.println(n);
            
        }
        }
    }
}