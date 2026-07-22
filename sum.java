class add{
    public static int sum(int n){
        if(n==1){
            return 1 ;
        }
        else {
           int add= n+sum(n-1);
        return add;
        }
        

}
public static void main(String[] args){
        int n=5;
        System.out.println(sum(n));


    }
}