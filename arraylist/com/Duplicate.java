package arraylist.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        for(int i=0;i<number;i++)
        {
            list.add(scanner.nextInt());
        }

        ArrayList<Integer>duplicates=new ArrayList<>();

        for(int i=0;i<list.size();i++)
        {
            if(list.lastIndexOf(list.get(i))!=i)
            {
                if(!duplicates.contains(list.get(i)))
                    duplicates.add(list.get(i));
            }
        }

        System.out.println("Duplicate elements:");
        for (int i:duplicates)
        {
            System.out.print(i+" ");
        }

    }
}
