import java.util.*;
public class Queue
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int q[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the Data: ");
            q[i]=ob.nextInt();
        }
        int front=-1;
        int rear=-1;
        Function obj=new Function();
        
        dt=ob.nextInt();
        obj.enqueue(dt);
        obj.dequeue();
    }

}
class Function
{
    void enqueue(int d)
    {
        int data;
        if(front==4)
        {
            System.out.println("Overflow");
        }
        else
        {
            front=0;
        }
        System.out.println("Enter Element: ");
        data=d;
        rear++;
        q[rear]=data;

    }

    void dequeue()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println("Dequeue is : "+q[front]);
            front++;
        }
    }
}