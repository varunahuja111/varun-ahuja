#include<stdio.h>
main()
{
   printf("\n                       :::::::::::::::::::::::::::::::::::::");
   printf("\n                       ::                                 ::");
   printf("\n                       ::     +++++++++++++++++++++++     ::");
   printf("\n                       ::     |                     |     ::");
   printf("\n                       ::     |     WELCOME TO      |     ::");
   printf("\n                       ::     |                     |     ::");
   printf("\n                       ::     |    HOTEL JEWEL'S    |     ::");
   printf("\n                       ::     |                     |     ::");
   printf("\n                       ::     +++++++++++++++++++++++     ::");
   printf("\n                       ::                                 ::");
   printf("\n                       :::::::::::::::::::::::::::::::::::::");
   printf("\n                     Jewel Chowk, NH-1, Karnal, Haryana 132001       \n\n");
   printf("\n                       CHOOSE A CATEGORY                    ");
   printf("\n                       1) ROOM DESCRIPTION                  ");
   printf("\n                       2) GET AVAILABILITY                  ");
   printf("\n                       3) RESTAURANT                        ");
   printf("\n                       4) CANCELLATION                         \n");
   int a,b,i,g,f,h,j,k,l,m,n,o,p,q,r;
   char c[100],d[100],e[100];
   scanf("%d",&a);
   if (a==1)
   {
       printf("                    WHICH TYPE ROOM WOULD YOU LIKE TO HAVE:  \n");
       printf("                    1) AC ROOMS   \n");
       printf("                    2) NON AC ROOMS  \n");
       scanf("%d",&b);
    if (b==1)
   {
       printf("                       *) AC ROOMS\n");
       printf("                       *) ROOM SERVICE\n");
       printf("                       *) LUGGAGE PICK AND DROP FACILITY\n");
       printf("                       *) WIFI AVAILABILITY\n");
       printf("                       *) EVENING SNACKS\n");
       printf("                       *) RENT = Rs. 2000 per day( without food )\n");
   }
   else
   {
       printf("                       *) ROOM COOLERS\n");
       printf("                       *) ROOM SERVICE\n");
       printf("                       *) LUGGAGE PICK AND DROP FACILITY\n");
       printf("                       *) WIFI AVAILABILITY\n");
       printf("                       *) RENT = Rs. 1500 per day( without food )\n");
   }
   }
   if (a==2)
   {
       printf("                       ROOM TYPE:\n");
       printf("                       1) AC ROOM\n");
       printf("                       2) NON AC ROOM\n");
       scanf("%d",&q);
   if (q==1)
   {
       printf("                     ****\\\\APPLICATION FORM////****\n");
       printf("                      NAME:");
       scanf("%s",&c);
       printf("\n");
       printf("                      ADDRESS:");
       scanf("%s",&d);
       printf("\n");
       printf("                      MOB:");
       scanf("%d",&i);
       printf("\n");
       printf("                      EMAIL ID:");
       scanf("%s",&e);
       printf("\n");
       printf("                      No. OF MEMBERS:");
       scanf("%d",&g);
       printf("\n");
       printf("                      FOR HOW MANY DAYS YOU HAVE TO STAY:");
       scanf("%d",&f);
       r=2000*f;
       printf("                      ATTACH ATLEAST 2 ID PROOFS WITH THIS FORM.");
       printf("\n");
       printf("                      MAKE PAYMENT OF Rs. %d\n",r);
   }
   else
   {
        printf("                     ****\\\\APPLICATION FORM////****\n");
       printf("                      NAME:");
       scanf("%s",&c);
       printf("\n");
       printf("                      ADDRESS:");
       scanf("%s",&d);
       printf("\n");
       printf("                      MOB:");
       scanf("%d",&i);
       printf("\n");
       printf("                      EMAIL ID:");
       scanf("%s",&e);
       printf("\n");
       printf("                      No. OF MEMBERS:");
       scanf("%d",&g);
       printf("\n");
       printf("                      FOR HOW MANY DAYS YOU HAVE TO STAY:");
       scanf("%d",&f);
       printf("\n");
       r=1500*f;
       printf("                      ATTACH ATLEAST 2 ID PROOFS WITH THIS FORM.");
       printf("\n");
       printf("                      MAKE PAYMENT OF Rs. %d\n",r);
   }
   }
   if (a==3)
   {
       printf("                         ENTER A OPTION\n");
       printf("                         1) BREAKFAST\n");
       printf("                         2) LUNCH\n");
       printf("                         3) DINNER\n");
       scanf("%d",&h);
   }
   if (h==1)
   {
       printf("SELECT AN ITEM\n");
       printf("1) sandwich = Rs. 15/only\n");
       printf("2) paratha = Rs. 20/only\n");
       printf("3) chole bhature = Rs. 50 per plate\n");
       scanf("%d",&j);
          {if (j==1)
        k=15;
        else if (j==2)
        k=20;
        else
        k=50;
   }
   printf("                            MAKE PAYMENT OF Rs. %d",k);
   }

   if (h==2)
   {
       printf("SELECT AN OPTION\n");
       printf("1) dal makni , rice, naan, curd @ Rs.70/only");
       printf("2) chana ,rice , shahi paneer, naan, tandoori chapati @ Rs.100/ only");
       printf("3) JEWEL's special ( malai kofta, shahi paneer , naan , tandoori chapati, raita, sweetdish ) @ Rs. 180/only\n");
       scanf("%d",&l);
       {
           if(l==1)
            m=70;
           else if(l==2)
           m=100;
           else
            m=180;
       }
       printf("                       MAKE PAYMENT OF Rs. %d",m);
   }
   if (h==3)
   {
       printf("SELECT AN OPTION\n");
       printf("1) dal,tava chapati, raita, sweetdish @ Rs.80/only\n");
       printf("2) shahi paneer, tandoori chapati , desert @ Rs. 150/only\n");
       printf("3) DINNER SPECIAL ( shahi chaap, kadhai paneer, naan, desert ) @ Rs. 220/only\n");
       scanf("%d",&n);
       {
           if(n==1)
            o=80;
           else if(n==2)
            o=150;
           else
            o=220;
       }
       printf("                         MAKE PAYMENT OF Rs. %d",o);
   }
   if (a==4)
   {
       printf("                        WHICH ROOM HAVE YOU CHOSEN:\n");
       printf("                        1) AC ROOM\n");
       printf("                        2) NON AC ROOM\n");
       scanf("%d",&p);
       if(p==1)
        printf("                    TAKE A REFUND OF Rs. 2000\n");
       else
        printf("                    TAKE A REFUND OF Rs. 1500\n");
   }
}
