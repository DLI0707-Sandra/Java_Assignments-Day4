package linearsearch.com;

import java.util.Scanner;

public class FindAllIndices
{
    public static void linearSearch(int[] array,int find)
    {
        boolean present=false;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==find)
            {
                System.out.print(i+" ");
                present=true;
            }
        }
        if(!present)
        {
            System.out.println("Not present");
        }

    }
    public static void main(String [] args)
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
        System.out.print(find+" present at indices: ");
        linearSearch(array,find);


    }
}
