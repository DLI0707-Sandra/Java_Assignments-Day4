package sorting.com;

import java.util.Scanner;

public class BubbleSort
{
    public static void bubblesort(int[] array)
    {
        int length=array.length;
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
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

        bubblesort(array);

        System.out.println("After sorting");
        for (int i=0;i<number;i++)
        {
            System.out.print(array[i]+" ");
        }


    }
}

