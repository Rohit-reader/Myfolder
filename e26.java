import java.util.*;
class e26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i = 0;i<name.length();i++)
        {
            if(((int)name.charAt(i)>=65)&&((int)name.charAt(i)<=122))
            {
                if(((int)name.charAt(i)>=91)&&((int)name.charAt(i)<=96))
                    continue;
                else
                    System.out.print(name.charAt(i));
            }
        }
    }
}