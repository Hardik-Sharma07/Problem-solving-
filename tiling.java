class tiling{
    public static int value(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=value(n-1);
        int fnm2=value(n-2);
        int total=fnm1+fnm2;
        return total;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(value(n));
    }
}