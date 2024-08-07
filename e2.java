import java.util.*;
class e2
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
              int a=sc.nextInt();
              int i,n,min1,max1;
              int[] b=new int[a];
              for(i=0;i<a;i=i+1)
              {      
                      System.out.println(i+"input");
                     b[i]=sc.nextInt();
                 
              }
              min1=b[0];
               for(i=1;i<a;i=i+1)
               {
                   
                    if(min1>b[i])
                     {
                         min1=b[i];
                     }
               }
                     System.out.println(min1+" is the min number");
                 max1=b[0];
               for(i=1;i<a;i=i+1)
               {
                   
                    if(max1<b[i])
                     {
                         max1=b[i];
                     }
               }
                System.out.println(max1+" is the max number");
         }
    }