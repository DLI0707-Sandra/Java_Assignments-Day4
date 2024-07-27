package binarysearch.com;

import java.util.Scanner;

public class SmallestandLargest
{
    public static int smallest(int[] array,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(array[mid]>=target)
                return mid;
            else if(array[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }

    public static int largest(int[] array,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(array[mid]<=target&&array[mid+1]>target)
                return mid;
            else if(array[mid]>target)
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
        System.out.println("Enter the elements in the sorted array:");
        for (int i=0;i<number;i++)
        {
            array[i]=scannerObject.nextInt();
        }
        System.out.println("Enter the target value:");
        int target=scannerObject.nextInt();
        int smallest=smallest(array,0,array.length,target);
        int largest=largest(array,0,array.length,target);
        System.out.println("Smallest element greater than or equal to "+target+" is at index "+smallest+"(value:"+array[smallest]+")");
        System.out.println("Largest element greater than or equal to "+target+" is at index "+largest+"(value:"+array[largest]+")");

    }
}
