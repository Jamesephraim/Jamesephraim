//BINARY SEARCH


import java.util.Scanner;
class Binarysearch{

    public static void main(String ar[])
    {
          int a[] = new int[10];
          int low=0,n,high=0,key,mid=0;
          Scanner s=new Scanner(System.in);


          System.out.print("--------------BINARY SEARCH--------------");

          System.out.print("Enter How many Values :");
          n=s.nextInt();

          System.out.print("Enter Key to find :");
          key=s.nextInt();

          for(int i=0;i<n-1;i++)
          {
            System.out.print("Enter "+i+" Values :");
            a[i] = s.nextInt();
          }
          high=n-1;
        while(low<high)
        {
            mid=(low+high)/2;
            if(a[mid] == key)
            {
                System.out.println(key+ " Found at" +mid+ "Position" );
                break;
            }
            else if(a[mid] > key)
            {
                high=mid-1;
            }
            else if(a[mid] < key)
            {
                low=mid+1;
            }
            else{
                System.out.println(key+ "Not Found !!!");
 
            }

        }

    }
}