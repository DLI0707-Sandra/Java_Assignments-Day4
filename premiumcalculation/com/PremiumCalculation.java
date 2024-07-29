package premiumcalculation.com;

import java.util.Scanner;

public class PremiumCalculation
{

    public static void main(String[] args)
    {
        InsurancePolicy insurance_policy=new InsurancePolicy();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the details:");
        System.out.println("Enter the name:");
        insurance_policy.setType(scanner.next());
        System.out.println("Enter the base:");
        insurance_policy.setBase(scanner.nextLong());
        System.out.println("Enter the risk factor:");
        insurance_policy.setRisk_factor(scanner.nextDouble());
        insurance_policy.setPremium();
        int choice;
        do{
            System.out.println("1.Calculate premium\n2.Update premium\n3.Exit");
            System.out.println("Enter the choice:");
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Calculated Premium="+insurance_policy.getPremium());
                    break;
                case 2:
                    System.out.println("Enter the new risk factor:");
                    insurance_policy.setRisk_factor(scanner.nextDouble());
                    insurance_policy.setPremium();
                    System.out.println("Updated Premium="+insurance_policy.getPremium());
                    break;
                case 3:
                    System.out.println("Exiting!");
                    break;
            }
        }while(choice!=3);
    }
}
