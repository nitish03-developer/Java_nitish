import java.util.*;
public class Sorting 
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int[5];
        int i,j,temp;
        System.out.println("Enter the array: ");
        for(i=0;i<=4;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("Array before Sorting");
        for(i=0;i<=4;i++)
        {
            System.out.println(a[i]);
        }
        for(i=1;i<=4;i++)
        {
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println("Array after sorting");
        for(i=0;i<=4;i++)
        {
            System.out.println(a[i]);
        }

    }
}