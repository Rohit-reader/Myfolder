import java.util.*;
class e27
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String Input: ");
		String name = sc.nextLine();
		char[] temp = name.toCharArray();
		Arrays.sort(temp);
        System.out.println("The Original Array: "+name);
		name = new String(temp);
		System.out.println("The Resultant Array: "+name);
	}
}