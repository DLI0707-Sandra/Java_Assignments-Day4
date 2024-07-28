package sorting.com;

import java.util.Scanner;

public class MergeSort
{
    public static void merge(int[] array,int start,int mid,int end)
    {
        int size1=mid-start+1;
        int size2=end-mid;
        int array1[] = new int[size1];
        int array2[] = new int[size2];

        for (int i = 0; i < size1; ++i)
            array1[i] = array[start+ i];
        for (int j = 0; j < size2; ++j)
            array2[j] = array[mid + 1 + j];

        int i = 0, j = 0;

        int k = start;
        while (i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                array[k] = array1[i];
                i++;
            }
            else {
                array[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            array[k] = array1[i];
            i++;
            k++;
        }

        while (j < size2) {
            array[k] = array2[j];
            j++;
            k++;
        }
    }

    public static void mergesort(int[] array,int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            mergesort(array,start,mid);
            mergesort(array,mid+1,end);

            merge(array,start,mid,end);
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

        mergesort(array,0,array.length-1);

        System.out.println("After sorting");
        for (int i=0;i<number;i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}
