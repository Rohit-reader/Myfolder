  
import java.util.*;
class e22
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
              String a=sc.nextLine();
              int c=a.length();
              int i=0;
              char[] d=new char[c];
              char[] e=new char[c];
              d=a.toCharArray();

              for(i=0;i<c;i++)
              {
                //System.out.println(d[i]);
            //  } 
                if(Character.isLowerCase(d[i]))
                  {
                    e[i]=Character.toUpperCase(d[i]);
                  }
                  else
                  {
                     e[i]=Character.toLowerCase(d[i]);
                  
                  }
              }
                   for(i=0;i<c;i++)
                   {
                    System.out.println(e[i]);
                   }
              
         }
    }
