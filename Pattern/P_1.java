class P_1
{
    public static void main(String args[])
    {
        int p=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                p=p+1;
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}