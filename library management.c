#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
typedef struct tree
{
	int data;
	struct tree *left;
	struct tree *right;
}node;


node *insert(node *root,int k)
{

if(root==NULL)
{
	root=(node*)malloc(sizeof(node));
	root->left=root->right=NULL;
	root->data=k;
}
else if(k>(root->data))
	root->right=insert(root->right,k);
else if(k<(root->data))
	root->left=insert(root->left,k);

return(root);
}

int search(node *root,int k)
{
 if(root==NULL)
	return 0;
if(root->data==k)
	return 1;
if(k<root->data)
	return search(root->left,k);
if(k>root->data)
	return search(root->right,k);
}

node *insuc(node *root) 			//INORDER SUCCESSOR
{
node *temp=root;
temp=temp->right;
while(temp->left!=NULL)
temp=temp->left;
return temp;
}

node *del(node *root,int k)                  //DELETION
{
if(root==NULL) //FINDING THE NODE
	return root;
else if(k<root->data)
	root->left=del(root->left,k);
else if(k>root->data)
	root->right=del(root->right,k);
else           //NODE FOUND
{
if((root->left==NULL)&&(root->right==NULL)) //NO CHILD CASE
{
	free(root);
	root=NULL;
	return(root);
}
else if(root->left==NULL)                  //RIGHT CHILD CASE
{
	node *temp=root;
	root=root->right;
	free(temp);
	return root;
}
else if(root->right==NULL)		   //LEFT CHILD CASE
{
	node *temp=root;
	root=root->left;
	free(temp);
	return(root);
}
else					   //BOTH CHILDREN CASE
{
node *temp=insuc(root);
root->data=temp->data;
root->right=del(root->right,temp->data);
return root;
}}}

void main()                                     //MAIN
{
//char g[20];
char namess[20];
int coo;
int pol;
    char name[20];
    char sname[20];
    char names[20];
    char namesy[10];
node *start;
int q,v,count=0;
int c,d,f,g,i,j,k,l,m,y,z;
char a[25],b[25],h[25],x[25],w[25];
start=NULL;
M:
printf("                                        ---------------------------                                     \n");
printf("                                        |LIBRARY MANAGEMENT SYSTEM|                                     \n");
printf("                                        ---------------------------                                     \n");
printf("            Enter the option:\n");
printf("            1)Librarian\n");
printf("            2)Student\n");
printf("            3)Teacher\n");
printf("            4)Exit\n");
scanf("%d",&c);
switch(c)
{
case 1:

printf("Press 1 for existing librarian and 0 for new\n");
scanf("%d",&d);
if(d==1)
{
printf("Enter the password:\n");
scanf("%d",&f);
if(f==123){
        J:
    printf("        1)Add librarian\n");
    printf("        2)check account\n");
    printf("        3)Exit\n");
    scanf("%d",&g);
    switch(g){
case 1:
    printf("ENTER THE NAME:");
    scanf("%s",&name);
    //gets(a);
    printf("ENTER THE ID:");
    scanf("%s",&names);

    //gets(b);
goto J;
case 2:
    printf("Enter the name of librarian:");
    scanf("%s",&namess);

    //gets(h);
    for(q=0;q<20;q++)
    {
    for(v=0;v<20;v++)
    {


    if(name[q]==names[v])
    {


        printf("LIBRARIAN FOUND");
    }

    else

        printf("NO SUCH ENTRY");
    }
    }

goto J;
case 3:
    break;
    }
    }
    else
        printf("INCORRECT PASSWORD!");
    break;

        }
goto M;
case 2:
    N:
    printf("Enter the name of student:\n");
    scanf("%s",&sname);

    //gets(w);
    printf("Enter the ID:\n");
    scanf("%d",&j);
    printf("1)ISSUE");
    printf("2)REISSUE");
    printf("3)RETURN");
    printf("4)EXIT\n");
    scanf("%d",&k);
    switch(k){
    case 1:
        for(l=0;l<5;l++)
        {
            printf("Enter the book ID:");
            scanf("%d",&m);
            start=insert(start,m);
            printf("IF YOU WANT TO ENTER MORE PRESS 1");
            scanf("%d",&y);
            if(y!=1)
                break;
        }
        goto N;
    case 2:
        printf("Enter the book Id:");
        scanf("%d",&m);
        z=search(start,m);
        if(z)
            printf("found!!!");
            else
            printf("Not found!!!");
        goto N;
    case 3:
        printf("Enter the book Id:");
        scanf("%d",&m);
        del(start,m);
        goto N;
    case 4:
        break;
    }
    goto M;
case 3:
           A:

    printf("Enter the name:");
    scanf("%s",&namesy[10]);

    //gets(w);
    printf("Enter the ID:");
    scanf("%d",&j);
    printf("1)ISSUE\n");
    printf("2)REISSUE\n");
    printf("3)RETURN\n");
    printf("4)EXIT\n");
    scanf("%d",&k);
    switch(k){
    case 1:
        B:
        printf("Press 1 to choose a Fictional Book and press 2 for Non Fictional:\n");
scanf("%d",&coo);
        printf("The following books are available with us:\n1.)The Harry Potter:The Goblet Of Fire\n2.)Ps I love You\n3.)Around the World in 80 days\n4.)The Canterville Ghost \n5.)The Da Vinci Code\n6.)The Wings Of High\n");
            printf("Enter the Book Id");
        if(coo==1)
        {
                printf("Please select from the above books:\n");
                scanf("%d",&pol);

if (pol==1)
{

        printf("The name of the book is:The Harry Potter:The Goblet Of Fire\n");
        printf("The name of the author is:J.K Rowling\n");
        printf("The number of pages in the book is:\n550\n");
        printf("BOOK ID IS: 123");
        insert(start,123);
}
else if(pol==2)
{ printf("The name of the book is:P.S I Love You\n");
        printf("The name of the author is:Arther Singh\n");
        printf("The number of pages in the book is:\n150\n");
        printf("BOOK ID IS: 456");
        insert(start,456);

}
else if(pol==3)
{
    printf("The name of the book is:Around the World in 80 days\n");
        printf("The name of the author is:Varun Ahuja\n");
        printf("The number of pages in the book is:\n250\n");
        printf("BOOK ID IS: 789");
        insert(start,789);

}

else if(pol==4)
{ printf("The name of the book is:The Canterville Ghost\n");
        printf("The name of the author is:Yash Arora\n");
        printf("The number of pages in the book is:\n870\n");
        printf("BOOK ID IS: 159");
        insert(start,159);

}

else if(pol==5)
{ printf("The name of the book is:The Da Vinci Code You\n");
        printf("The name of the author is:Arther Doyle\n");
        printf("The number of pages in the book is:\n950\n");
        printf("BOOK ID IS: 753");
        insert(start,753);

}
else if(pol==6)
{ printf("The name of the book is:The Wings Of High\n");
        printf("The name of the author is:Sumit Sir\n");
        printf("The number of pages in the book is:\n910\n");
        printf("BOOK ID IS: 786");
        insert(start,786);

}
        }
else if(coo=2){
    printf("The following non fictional books are avialble with us:\n");
}
else{
    break;
}
            printf("\nIF YOU WANT TO ENTER MORE PRESS 1:");
            scanf("%d",&y);
            if(count<5){
            if(y!=1)
            {


                printf("Thank you for your time");
                break;
        }

        else {
                count=count+1;
            printf("You have issued Just one book\n");
            goto B;
        }}
    else {
        printf("LIMIT EXCEED!!!!!");
    }
        goto N;
    case 2:
        printf("Enter the book Id:");
        scanf("%d",&m);
        z=search(start,m);
        if(z)
            printf("found!!!");
            else
            printf("Not found!!!");
        goto A;
    case 3:
        printf("Enter the book Id:");
        scanf("%d",&m);
        del(start,m);
        goto A;
    case 4:
        break;
    }
    goto M;

}

}

