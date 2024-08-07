import java.util.*;
class e24
    {
        public static void main(String[] args)
         {
              Scanner sc=new Scanner(System.in);
              int a=sc.nextInt();
             //  String b=sc.nextline();
              //  int x;
               //  int y;
               //int a=sc.nextInt();
              int i,n,sum=0,c1=0,c2=0,c3=0,c4=0,j=0,q=0,w=0;
              String[] c=new String[a];
                int[] x=new int[a];
                int[] y=new int[a];
              String[] chola=new String[a];
              String[] chera=new String[a];
               String[] pallava=new String[a];
                String[] pandiyas=new String[a];
              for(i=0;i<a;i++)
              {
                 c[i]=sc.next();
                 x[i]=sc.nextInt();
                 y[i]=sc.nextInt();
                 if(x[i]>0 && y[i]>0)
                 {
                 chola[i]=c[i];
                 c1++;
                 }
                  if(x[i]<0 && y[i]>0)
                 {
                 chera[j]=c[i];
                 c2++;
                 }
                 if(x[i]<0 && y[i]<0)
                 {
                 pallava[q]=c[i];
                 c3++;
                 }
                  if(x[i]>0 && y[i]<0)
                 {
                 pandiyas[w]=c[i];
                 c4++;
                 }


              }
              System.out.println("-chola-");
              for(i=0;i<c1;i++)
              {
                System.out.println(chola[i]);
                
              }
              System.out.println("-chera-");
               for(i=0;i<c2;i++)
              {
               
                 System.out.println(chera[i]);
                  
              }
               System.out.println("-pallava-");
               for(i=0;i<c3;i++)
              {
            
                  System.out.println(pallava[i]);
                  
              }
              System.out.println("-pandiyas-");
               for(i=0;i<c4;i++)
              {
               
                   System.out.println(pandiyas[i]);
              }
         }
    }