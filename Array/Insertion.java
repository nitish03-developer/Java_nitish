import java.util.*;
class Insertion
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int i,n,ele,pos;
        System.out.println("Enter the number of array element: ");
        n=ob.nextInt();
		int arr[]=new int[n];
        System.out.println("Enter the array element: ");
        for(i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter element to be inserted: ");
        ele=ob.nextInt();
        System.out.println("Enter position of inserted: ");
        pos=ob.nextInt();
        for(i=n-1;i>=pos;i++)
        {
            arr[i+1]=arr[i];
        }
        arr[pos]=ele;
        n++;
        System.out.println("Array element after insertion");
        for(i=0;i<=n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}