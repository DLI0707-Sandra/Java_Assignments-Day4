package binarysearch.com;

import java.util.Arrays;
import java.util.Scanner;

public class FirstandLastOccurance
{
    public static int binarysearchfirst(int[] array,int start,int end,int find)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if((mid==0||find>array[mid-1])&&array[mid]==find)
                return mid;
            else if(array[mid]<find)
                return binarysearchfirst(array,(mid+1),end,find);
            else
                return binarysearchfirst(array,start,(mid-1),find);
        }
        return -1;
    }

    public static int binarysearchlast(int[] array,int start,int end,int find)
    {

        while(start<=end)
        {
            int mid=(start+end)/2;
            if((mid==0||find<array[mid+1])&&array[mid]==find)
                return mid;
            else if(array[mid]>find)
                return binarysearchlast(array,start,(mid-1),find);
            else
                return binarysearchlast(array,(mid+1),start,find);
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
        System.out.println("Enter the element to be searched:");
        int find=scannerObject.nextInt();
        int first=binarysearchfirst(array,0,array.length,find);
        int last=binarysearchlast(array,0,array.length,find);


        System.out.println("First and last occurrences are at indices "+first+" and "+last+" respectively.");
    }
}
