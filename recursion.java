class recursion {
    public static void func(int n){
        System.out.print(n);
        func(n-1);
    }
    public static void main(String args[]){
      
        return func(int n=10);
    }
}