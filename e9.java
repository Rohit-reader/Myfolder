import java.util.*;
class e9
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
              int a=sc.nextInt();
               int c=sc.nextInt();
              int i,n,sum=0,avg1=1,count=0;
              int[] b=new int[a];
               
              for(i=0;i<a;i=i+1)
              {      
                      System.out.println(i+"input");
                     b[i]=sc.nextInt();
              }
              for(i=0;i<a;i=i+1)

             {
                if(c==b[i])
                {
                    b[i]=0;
                    count=count+1;;

                }
                    // System.out.println(b[i]);
                   
                     
             }  
             // Arrays.rsort(b);
               for(i=0;i<a;i=i+1)
              {      
                  if(b[i]!=0)
                  {
                      System.out.println(b[i]);
                  }
              }
              for(i=0;i<count;i=i+1)
              {
                 System.out.println("0");     
              }
         }


    }