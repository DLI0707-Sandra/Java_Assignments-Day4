package linearsearch.com;

import java.util.Scanner;

public class CharacterOccurance
{

    public static void main(String [] args)
    {
        String string=new String();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        string=scanner.next();

        char[] chars=string.toCharArray();
        int count=0;
        System.out.println("Enter the character whose count is to be found:");
        char character=scanner.next().charAt(0);
        for (int i=0;i<chars.length;i++)
        {
            if(chars[i]==character)
                count++;
        }

        System.out.println("Count of character "+character+" in string "+string+":"+count);

    }
}
