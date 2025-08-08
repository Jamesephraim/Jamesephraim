#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct  Node* left;
    struct  Node* right;
    int height;
};

struct Node* insert(struct Node* root,int key)
{
    int bal;
    if(root==NULL)
    {
        struct Node* nn=(struct Node*)  malloc(sizeof(struct Node));
        if(nn!=NULL)
        {
            nn->data=key;
            nn->left=NULL;
            nn->right=NULL;
            nn->height=1;
        }
    }
    else if(key < root->data)
    {
        root->left=insert(root->left,key);
    }
    else if(key > root->data)
    {
        root->right=insert(root->right,key);
    }
    else 
    {
        return root;
    }
    

}
void dis(struct Node* root)
{
    if(root!=NULL){
        dis(root->left);
        printf("%d\t",root->data);
        dis(root->right);
    }
}
 


void main()
{
    struct  Node* root =NULL;
    int key,ch;
    do
    {
        printf("\n[1] INSERT");
        printf("\n[2] INSERT");
        printf("\n[3] DISPLAY");
        printf("\n[4] INSERT");
        printf("\n[5] EXIT");
        printf("\nEnter choice ::");
        scanf("%d",&ch);
        switch (ch)
        {
        case 1 :
        printf("\n\nEnter to Insert ::");
        scanf("%d",&key);
            root=insert(root,key);
            break;
        case 3:
            dis(root);
            break;
        
        default:
            break;
        }
         
    } while (ch);
    
     
}