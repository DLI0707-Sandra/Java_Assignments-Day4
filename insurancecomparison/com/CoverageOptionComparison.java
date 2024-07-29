package insurancecomparison.com;

import java.util.ArrayList;
import java.util.Scanner;

public class CoverageOptionComparison
{
    public static void main(String [] args)
    {
        Coverages coverages=new Coverages();

        Scanner scanner=new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.Add coverage option\n2.Compare available options\n3.Best option\n4.Exit ");
            System.out.println("Enter the choice:");
            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    Coverage coverage=new Coverage();
                    System.out.println("Enter the details:");
                    System.out.println("Type:");
                    coverage.setType(scanner.next());
                    System.out.println("Amount:");
                    coverage.setAmount(scanner.nextLong());
                    System.out.println("Premium:");
                    coverage.setPremium(scanner.nextDouble());
                    coverages.addOptions(coverage);
                    break;
                case 2:coverages.display();
                    System.out.println("Coverages with highest amount in each type:");
                    ArrayList<String>types=coverages.getTypes();
                    for(int i=0;i<types.size();i++)
                    {
                        coverages.printbest(types.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Enter criteria:");
                    String criteria=scanner.next();
                    switch (criteria)
                    {
                        case "amount":coverages.findbestAmount();
                                    break;

                        case "premium":coverages.findBestPremium();
                                    break;
                    }
                    break;
                case 4:
                    System.out.println("Exiting!");
                    break;

            }

        }while(choice!=4);
    }
}
