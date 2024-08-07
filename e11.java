
import java.util.*;
class e11
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
              int a=sc.nextInt();
              int i,n,sum=0,avg1=1,flag=0;
              int[] b=new int[a];
              for(i=0;i<a;i=i+1)
              {      
                      System.out.println(i+"input");
                     b[i]=sc.nextInt();
              }
              for(i=0;i<a;i=i+1)
                {
                     if(b[i]!=1 && b[i]!=4)
                     {
                        flag=1;
                        break;
                     }
                }
               if(flag==1)
               {
                System.out.println("False");
               } 
               else
               {
                 System.out.println("True");
               }
         }
    }
