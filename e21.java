import java.util.*;
class e21
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
              String a=sc.nextLine();
              int c=a.length();
              if(c%2==1)
              {
                 int b=c/2;
                 System.out.println(a.charAt(b)); 
              }
              else
              {
                 int b=c/2;
                int r=b-1;
                 System.out.println(a.charAt(r));
                  System.out.println(a.charAt(b));
              }
         }
    }
               