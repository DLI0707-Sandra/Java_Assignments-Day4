package binarysearch.com;

import java.util.Arrays;
import java.util.Scanner;

public class BasicBinarySearch
{
    public static int binarysearch(int[] array,int start,int end,int find)
    {
        int mid=(start+end)/2;
        while(start<end)
        {
            if(array[mid]==find)
                return mid;
            else if(array[mid]>find)
                end=mid-1;
            else
                start=mid+1;
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

        Arrays.sort(array);
        System.out.println("Enter the element to be searched:");
        int find=scannerObject.nextInt();

        int result=binarysearch(array,0,array.length,find);

        if (result!=-1)
        {
            System.out.println("Element present at index "+ (result));
        }
        else
            System.out.println("Not found!");
    }
}
