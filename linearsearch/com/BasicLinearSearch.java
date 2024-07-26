package linearsearch.com;

import java.util.Scanner;

public class BasicLinearSearch
{

    public static int linearSearch(int[] array,int find)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==find)
                return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {

        Scanner scannerObject=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scannerObject.nextInt();
        int[] array=new int[number];
        System.out.println("Enter the elements in the array:");
        for (int i=0;i<number;i++)
        {
            array[i]=scannerObject.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int find=scannerObject.nextInt();

        int result=linearSearch(array,find);

        if (result!=-1)
        {
            System.out.println("Element present at index "+ result+1);
        }
        else
            System.out.println("Not found!");

    }
}
