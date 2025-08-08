#include<stdio.h>

void BSR(int a[],int key , int low,int high)
{
     int mid;
    while (low<=high)
    {
        mid=(low+high)/2;

        if(key==a[mid])
        {
            printf("\nKEY %d is Found at %d Position \n\n",key,mid);
            break;
        }
        else if(a[mid] > key)
        {
            BSR(a,key,low,mid-1);
        }
        else if(a[mid] < key)
        {
            BSR(a,key,mid+1,high);
        }
        else
        {
            printf("\nKEY %d Not Found\n",key);
        }
        
    }
    
}
void main()
{
    int a[10],i,n,key,res,low,high;
    printf("\nEnter Size of Array :");
    scanf("%d",&n);
    printf("\nEnter Array Elements ....\n");
    for ( i = 0; i < n; i++)
    {
       printf("Enter Element %d :",i+1);
       scanf("%d",&a[i]);
    }
    printf("\nEnter KEY to Search :");
    scanf("%d",&key);
    high=n-1;
    BSR(a,key,low,high);
    //printf("%d",res);

    
    
}