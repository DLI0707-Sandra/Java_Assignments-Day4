package binarysearch.com;

import java.util.Scanner;

public class PeakElement
{
    public static int peakelement(int[] array,int start,int end)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(array[mid+1]<array[mid]&&array[mid-1]<array[mid])
                return mid;
            else if (array[mid+1]>array[mid])
                start=mid+1;
            else if(array[mid-1]>array[mid])
                end=mid-1;
        }
        return -1;
    }
    public static void main(String [] args)
    {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scannerObject.nextInt();
        int[] array=new int[number];
        System.out.println("Enter the elements in the sorted array:");
        for (int i=0;i<number;i++)
        {
            array[i]=scannerObject.nextInt();
        }
        int peak=array[peakelement(array,0,array.length)];
        System.out.println(peak);
    }
}
