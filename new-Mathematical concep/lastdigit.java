class lastdigit {
    public static void main(String[] args) {
        int n=34567;
        while(n>0){
        int a=n%10;
        System.out.println(a);
        n=n/10;
        }
    }
}
