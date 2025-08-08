#include<stdio.h>

int findmin(int a[], int n)
{
    int min;
    //Finding MIN Value
        if(n==1) return a[0];
        min=findmin(a,n-1);

        return (a[n-1] < min) ? a[n-1] : min;

}

int findmax(int a[], int n)
{
    int max;
    //Finding MIN Value
        if(n==1)
        {
             return a[0];
        }
         max=findmin(a,n-1);
         if( a[n-1] > max )
         {
            return a[n-1];
         }
         else{
            return max;
         }

        // return (a[n-1] > max) ? a[n-1] : max;

}
 

void main()
{
    int a[10];
    int res,n,i;

    printf("\nEnter Array Size :");
    scanf("%d",&n);
    for( i=0;i<n;i++)
    {
        printf("\nEnter Array Element %d :",i);
        scanf("%d",&a[i]);
    }
    res=findmin(a,n);
    
    printf("\n\nMIN :%d\n\n",res);
    printf("\n\nMAX :%d\n\n",findmax(a,n));
   
}
