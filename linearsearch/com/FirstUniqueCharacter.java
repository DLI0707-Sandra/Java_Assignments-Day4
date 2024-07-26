package linearsearch.com;

import java.util.Arrays;
import java.util.Scanner;

public class FirstUniqueCharacter
{
    public static int linearSearch(char[] array,char find)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==find)
                return i;
        }
        return -1;
    }

    public static void main(String [] args) {
        String string = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        string = scanner.next();

        char[] chars = string.toCharArray();
        char unique = ' ';
        if (chars.length == 1)
        {
            System.out.println("First Unique Character:" + chars[0]);
            return;
        }
        if(chars.length>=2&&chars[0]!=chars[1])
        {
            System.out.println("First Unique Character:"+chars[0]);
            return;
        }

        for(int i=1;i<chars.length;i++)
        {
            char[] beforecopy=Arrays.copyOfRange(chars,0,i);
            char[] aftercopy =Arrays.copyOfRange(chars,i+1,chars.length);

            if(linearSearch(aftercopy,chars[i])==-1&&linearSearch(beforecopy,chars[i])==-1)
            {
                unique = chars[i];
                break;
            }
        }

        System.out.println("First Unique Character:"+unique);

    }
}
