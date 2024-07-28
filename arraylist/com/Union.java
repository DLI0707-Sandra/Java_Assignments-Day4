package arraylist.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Union
{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the elements of first list:");
        for (int i = 0; i < number1; i++) {
            list1.add(scanner.nextInt());
        }
        System.out.println("Enter the number of elements:");
        int number2 = scanner.nextInt();
        System.out.println("Enter the elements of first list:");
        for (int i = 0; i < number2; i++) {
            list2.add(scanner.nextInt());
        }

        ArrayList<Integer> union =new ArrayList<>();

        union.addAll(list1);
        union.addAll(list2);

        System.out.println("Union of elements are:");
        for(int i: union)
        {
            System.out.print(i+" ");
        }
    }

}
