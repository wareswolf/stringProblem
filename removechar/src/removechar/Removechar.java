package removechar;
import java.util.Scanner;

public class Removechar {

	public static void main(String[] args)
    {
		System.out.println("Enter a string");
		Scanner str = new Scanner(System.in);
		String  text = str.nextLine();
		
		System.out.println("Enter a charactor");	
		Scanner x = new Scanner(System.in);
		char letter = x.next(".").charAt(0);
	
        System.out.println(removeChr(text,letter));
    }

    public static String removeChr(String text, char letter){
        StringBuilder strBuilder = new StringBuilder();
        char[] rmString = text.toCharArray();
        for(int i=0; i<rmString.length; i++)
        {
            if(rmString[i] == letter)
            {

            } else {
                strBuilder.append(rmString[i]);
            }
        }
        return strBuilder.toString();
    }
}
