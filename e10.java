import java.util.*;
class e10
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
              int a=sc.nextInt();
              int i,n,sum=0,avg1=1,k=0;
              int[] b=new int[a];
               int[] c=new int[a];
              for(i=0;i<a;i=i+1)
              {      
                      System.out.println(i+"input");
                     b[i]=sc.nextInt();
              }
             
               for(i=0;i<a;i=i+1)
              {
                       if(b[i]%2==0)
                       {
                          c[k]=b[i];
                          k++;
                       } 
              }
               for(i=0;i<a;i=i+1)
              {
                       if(b[i]%2!=0)
                       {
                          c[k]=b[i];
                          k++;
                       } 
              }
               for(i=0;i<a;i=i+1)
              {      
                      System.out.println(c[i]);
                     
              }
         }
    }