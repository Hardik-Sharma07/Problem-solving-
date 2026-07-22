import java.util.*;
public class start{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter value of a: ");
        int a =sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
       for(int i=1;i<=a;i++){
           for(int j=1;j<=b;j++){
               if(i==1||j==1||i==a||j==b){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
               
           }
           System.out.println();
           
        }
    }
    public static void inverted_triangle(int n ){
        for(int m=0;m<=n;m++);{
            for(int o=1;o<=m;o++);{
                System.out.println(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }
}