import java.util.*;
public class perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++)
            {
            for(int j=1;j<=n;j++)
                {
            if(j==1)
                 {
            System.out.print("*");
        }
            else if(j==n)
                {
            System.out.print("%");
        }
            else if(i==1&&j!=1&&j!=n)
                {
            System.out.print("+");
        }
            else if(i==n&&j!=1&&j!=n)
                {
            System.out.print("-");
        }
            else if ((i!=1||i!=n) && (j==n-i+1))
                {
            System.out.print(n-i+j-1);
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