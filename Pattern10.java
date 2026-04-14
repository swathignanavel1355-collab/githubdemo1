import java.util.Scanner;
class Pattern10{
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");}
            for(int j=1;j<=(2*n)-(2*i-1);j++){
                System.out.print("*");}
                System.out.println("");
               // System.out.println("");
        }
    }
}
