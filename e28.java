import java.util.*;

class e28
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        name = name.toLowerCase();
        char[] temp = name.toCharArray();
        
        System.out.println("String without spaces:");
        for (int i = 0; i < temp.length; i++) 
        {
            if (temp[i] == ' ')
             {
                continue;
            }
             else {
                System.out.print(temp[i]);
            }
        }
    }
}
