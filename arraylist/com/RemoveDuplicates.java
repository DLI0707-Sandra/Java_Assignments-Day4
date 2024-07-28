package arraylist.com;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < number; i++) {
            list.add(scanner.nextInt());
        }

        ArrayList<Integer>single=new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            if (list.lastIndexOf(list.get(i)) == i)
            {
               single.add(list.get(i));
            }
        }


        System.out.println("After removing duplicates:");
        for (int i : single) {
            System.out.print(i + " ");
        }
    }
}
