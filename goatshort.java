import java.util.*;
class goatshort
{
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int a = sc.nextInt();
     System.out.println("Enter a number");
     int b = sc.nextInt(); 
     int c = 0;
     for(int i=1;i<=a;i++)
     {
        for(int j=1;j<=b;j++)
        {
            if(j==1)
            {
                System.out.print("*");
            }
            else if(j==b)
            {
                System.out.print("%");
            }
            else if((i==1) && (j!=1 || j!=b))
            {
                System.out.print("+");
            }
            else if((i==b) && (j!=1 || j!=b))
            {
              System.out.print("-");
            }
            else if((i!=1 || i!=b) && (j==(b-i+1)))
            {
                System.out.print(b+2-c);
                c=c+2;
            }
            else 
            {
                System.out.print(" ");
            }
        }
    System.out.println();
     }
    }
}