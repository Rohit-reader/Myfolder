import java.util.*;
class e5
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
               System.out.println("enter the size of the element");
              
              int a=sc.nextInt();
              
              int i,n,flag=0;
              int[] b=new int[a];
              int[] c=new int[a];
              
              for(i=0;i<a;i=i+1)
              {      
                      System.out.println(i+"input");
                     b[i]=sc.nextInt();
                 
              }
             //  for(i=0;i<a;i=i+1)
             // {      
                     // System.out.println(i+"input");
                     Arrays.sort(b);
              //  for(i=0;i<a;i=i+1)
             // {       
                       System.out.println("first two minimum number are:");
              
                      System.out.println(b[0]);
                       System.out.println(b[1]);
                    
                  System.out.println("first two maximum number are:");  
                   System.out.println(b[a-1]);
                       System.out.println(b[a-2]);
                 
             // }
         }
    }
                 
             
              
              
                            
               

    