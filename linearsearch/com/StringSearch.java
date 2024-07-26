package linearsearch.com;

import java.util.Scanner;

public class StringSearch
{
    public static int linearSearch(String[] strings,String find)
    {
        for(int i=0;i<strings.length;i++)
        {
            if(strings[i].equals(find))
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scannerObject.nextInt();
        String[] strings=new String[number];
        System.out.println("Enter the elements in the array:");
        for (int i=0;i<number;i++)
        {
            strings[i]=scannerObject.next();
        }

        System.out.println("Enter the element to be searched:");
        String find=scannerObject.next();

        int result=linearSearch(strings,find);

        if (result!=-1)
        {
            System.out.println("Element present at index :"+ result);
        }
        else
            System.out.println("Not found!");
    }
}
