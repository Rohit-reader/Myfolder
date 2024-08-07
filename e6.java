import java.util.*;
class e6
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
               System.out.println("enter the size of the element");
              
              int a=sc.nextInt();
              
              int i,n,flag=0,j;
              int[] b=new int[a];
              int[] c=new int[a];
              
              for(i=0;i<a;i=i+1)
              {      
                      System.out.println(i+"input");
                     b[i]=sc.nextInt();
              }
              Arrays.sort(b);
                 
            
              System.out.println("sorted order is:");
              for(i=0;i<a;i=i+1)
            {
              System.out.println(b[i]);
            }
             
         }
    }
           
         
    
                      
              
             
              
              
                            
               

    