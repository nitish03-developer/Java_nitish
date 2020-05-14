import java.util.Scanner;
public class Accessing_1_D_array_using_while_loop
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner ob=new Scanner(System.in);
        int i=0;
        System.out.println("Enter the array:");
        while(i<5)
        {
           a[i]=ob.nextInt();
           i++;
        }
        int j=0;
        System.out.println("You have Entered:");
        while(j<5)
        {
            System.out.println(a[j]);
            j++;
        }

    }
    
}