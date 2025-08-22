import  java.util.Arrays;


public class array_operations {

    void copy_to_another(){
        int src[]={0,1,2,3,4,5,6,7,8,9};
        int dst[]= new int[10];   //=Arrays.copyOf(src,src.length);

        for (int i=0;i<src.length;i++)
        {
            dst[i]=src[i];
        }
        //dst=Arrays.copyOf(src,src.length);

        //int dst[]=Arrays.copyOf(src,src.length);
        System.out.println("\nAfter Copy Dest Array Elements are :");
        for(int b:dst)
        {
            System.out.print(b);
        }



    }
    void sort(){
        int arr[]={4,5,3,7,6,2,0,1};
        int temp,i,j;
        System.out.println("\n----------------------------------\nBefore Sort :");
        for(int a:arr)
        {
            System.out.print(a);
        }
        //Arrays.sort(arr);
        //--------------Asce order-----------------------------

        for (i=0;i<arr.length;i++)
        {
            for (j=0;j< arr.length-1;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nAfter Sort Ascending order:");
        for(int a:arr)
        {
            System.out.print((a));
        }
        //--------------Desc order-----------------------------
        for (i=0;i<arr.length;i++)
        {
            for (j=0;j< arr.length-1;j++)
            {
                if (arr[j] < arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nAfter Sort Descending order:");
        for(int a:arr)
        {
            System.out.print((a));
        }

    }

    void  search(){
        int a[] ={0,4,3,7,5,6,2,8,9};
        int i,temp;
        int key=60;
        for (i=0;i<a.length;i++)
        {
            if(a[i] == key)
            {
                System.out.print("\n" +key+ " is Found at " +i+ " Position");
            } else if (a[i] != a.length) {
                a[i]=a[i+1];
            }
            else {
                System.out.println(key+" Not Found !!!");
            }


        }
    }

    public static void main(String[] args) {
        array_operations obj=new array_operations();
        obj.search();
    }
}
