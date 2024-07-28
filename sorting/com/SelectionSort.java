package sorting.com;

import java.util.Scanner;

public class SelectionSort
{
    public static void selectionsort(int[] array)
    {
        int smallest;
        int index=0;
        for(int i=0;i<array.length;i++)
        {
            smallest=array[i];
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]<smallest)
                {
                    smallest=array[j];
                    index=j;
                }
            }
            if(smallest!=array[i])
            {
                int temp=array[i];
                array[i]=array[index];
                array[index]=temp;
            }

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

        selectionsort(array);

        System.out.println("After sorting");
        for (int i=0;i<number;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
