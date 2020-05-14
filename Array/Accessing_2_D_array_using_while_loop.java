import java.util.*;
public class Accessing_2_D_array_using_while_loop
{
    public static void main(String args[])
    {
        int a[][]=new int[2][3];
        Scanner ob=new Scanner(System.in);
        int i=0;
        System.out.println("Enter the Array");
        while(i<2)
        {
            int j=0;
            while(j<3)
            {
                a[i][j]=ob.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("you have Entered");
        int p=0;
        while(p<2)
        {
            int k=0;
            while(k<3)
            {
                System.out.println(a[p][k]);
                k++;
            }
            p++;
        }

    }
}