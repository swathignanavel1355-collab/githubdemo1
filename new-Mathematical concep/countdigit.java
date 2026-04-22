import java.util.Scanner;
class countdigit {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        while(n>0){
        int a=n%10;
        count=count+1;
            System.out.println(count);
            n=n/10;
            
        }
        }
    }
