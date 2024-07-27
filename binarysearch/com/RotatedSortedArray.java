package binarysearch.com;

import java.util.Scanner;

public class RotatedSortedArray
{
    public static int binarysearch(int[] array,int start,int end,int find)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(array[mid]==find)
                return mid;
            else if(array[mid]>=array[start])
            {

                if(find>=array[start]&&find<array[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
            else
            {
                if(find>array[mid]&&find<=array[end])
                {
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
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
        System.out.println("Enter the target value:");
        int target=scannerObject.nextInt();

        int result=binarysearch(array,0,array.length,target);

        System.out.println("Element present at index:"+result);
    }
}
