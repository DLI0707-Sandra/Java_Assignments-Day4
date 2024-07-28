package sorting.com;

import java.util.Scanner;

public class InsertionSort
{
    public static void insertionsort(int[] array)
    {
        for(int i=1;i<array.length;i++)
        {
            int currentelement =array[i];
            int j=i-1;

            while (j>=0&&array[j]> currentelement)
            {
                array[j+1]=array[j];
                j=j-1;
            }

            array[j+1]= currentelement;
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

        insertionsort(array);

        System.out.println("After sorting");
        for (int i=0;i<number;i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}
