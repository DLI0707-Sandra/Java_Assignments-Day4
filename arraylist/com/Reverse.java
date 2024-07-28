package arraylist.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<number;i++)
        {
            list.add(scanner.nextInt());
        }

        for (int i=0;i<list.size()/2;i++)
        {
            int temp=list.get(i);
            list.set(i, list.get(list.size() - i-1));
            list.set(list.size()-i-1,temp );
        }

        System.out.println("After reversing:");
        for (int i:list)
        {
            System.out.print(i+" ");
        }

    }
}
