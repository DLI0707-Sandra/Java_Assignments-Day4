package linearsearch.com;

import java.util.Scanner;

public class MaximumElement
{
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

        int largest=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>largest)
                largest=array[i];
        }
        System.out.println("Largest in the array is "+largest);
    }


}
