import java.util.Scanner;
class Bubble
{
    public static void main(String args[])
    {
        int[] a = new int[10];
        int n,i,j;
        Scanner s= new Scanner(System.in);
        System.out.print("\nEnter Size of Array :");
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("\nEnter value "+i+":");
            a[i] = s.nextInt();
        }
        // System.out.println("Before Sorting Array Elements are :")
        // for(i=0;i<n-1;i++)
        // {
        //     a[i] = s.nextInt();
        // }

        int res=sort(a,n);



    }
    public static int sort(int[] a, int n)
    {
        int temp=0;
        int i,j;
        System.out.print("\nBefore Sorting Array Elements are :");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] =a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        System.out.print("\nAfter Sorting Array Elements are :");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
             
        }


        return temp;
    }
}