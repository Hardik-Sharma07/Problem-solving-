public class binaryproblem {
    public static void printbinary(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if (lastplace ==0){
            printbinary(n-1,0,str+"0");
            printbinary(n-1,1,str+"1");

        }
        else{
           
                printbinary(n-1,0,str+"0");

            
                }

    }
    public static void main(String args[]){
        int n=5;
        String str="";
        printbinary(n,0,str);
    }
}
