package binarysearch.com;

import java.util.Scanner;

public class SquareRoot
{

    public static void main(String [] args)
    {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=scannerObject.nextInt();
        int squareroot;
        int start=1,end=number/2;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid*mid==number)
            {
                System.out.println("Square root is:"+mid);
                return;
            }
            else if(mid*mid>number)
                end=mid-1;
            else
                start=mid+1;
        }
        System.out.println("Not a perfect square!");
    }
}
