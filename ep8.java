import java.util.*;
class ep8
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
               System.out.println("enter the input size");
              int a=sc.nextInt();
                System.out.println("enter the starting ignoring number");
               int s=sc.nextInt();
                System.out.println("enter the end ignoring number");
                int e=sc.nextInt();
              int i,n,sum=0,h1=0,h2=0;
              int[] b=new int[a];
              int[] c=new int[a];
              for(i=0;i<a;i=i+1)
              {      
                      System.out.println(i+"input");
                     b[i]=sc.nextInt();
                     
                     
              }
              for(i=0;i<a;i=i+1)
              {
                     if(b[i]==s)
                     {
                         h1=i;
                     }
                     if(b[i]==e)
                     {
                         h2=i;
                     }
                     
              }
              if(h1<h2)
              {
              for(i=h1;i<=h2;i=i+1)
              {
                  //c[i]=b[i];
                 // System.out.println(c[i]);
                 b[i]=0;
              }
              }
              for(i=0;i<a;i=i+1)
               {
                   sum=sum+b[i];
               }  
               System.out.println("sum:"+sum);
         }
    }
              
              
              
              
             
         
