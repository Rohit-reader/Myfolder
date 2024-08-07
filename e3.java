import java.util.*;
class e3
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
               System.out.println("enter the size of the element");
              
              int a=sc.nextInt();
              
              int i,n,flag=0;
              int[] b=new int[a];
              for(i=0;i<a;i=i+1)
              {      
                      System.out.println(i+"input");
                     b[i]=sc.nextInt();
                 
              }
              System.out.println("enter the search element");
              
              int c=sc.nextInt();
                 for(i=0;i<a;i=i+1)
                 {
                     if(c==b[i])
                     {
                         System.out.println("IN "+i+"index the element is found");
                         flag=1;
                     }
                 }
                 if(flag==0)
                 {
                     System.out.println("-1 the element is not found");
                 }
              
               
         }
    }
                     
               

    