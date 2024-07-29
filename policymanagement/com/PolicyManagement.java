package policymanagement.com;

import java.util.Objects;
import java.util.Scanner;

public class PolicyManagement
{

    public static void main(String[] args)
    {
        Policies policies=new Policies();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add new policy\n2.Remove policies\n3.Update details\n4.List by type\n5.View All\n6.Exit");
            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter policy details:");
                    System.out.println("Policy number:");
                    String policyNumber=scanner.next();
                    System.out.println("Policy holder name:");
                    scanner.nextLine();
                    String policyHolder=scanner.nextLine();
                    System.out.println("Type:");
                    String policyType=scanner.next();
                    System.out.println("Coverage:");
                    long policyCoverage=scanner.nextLong();
                    Policy policy=new Policy(policyNumber,policyHolder,policyType,policyCoverage);
                    policies.addPolicy(policy);
                        break;
                case 2:
                    System.out.println("Enter thr policy number :");
                    String policynumber=scanner.next();
                    policies.removePolicy(policynumber);
                        break;
                case 3:
                    System.out.println("Enter the policy number of the policy to be updated:");
                    String policy_number=scanner.next();
                    Policy oldpolicy=policies.findPolicy(policy_number);
                    System.out.println("Enter the field to be updated:");
                    String field=scanner.next();
                    switch (field)
                    {
                        case "Policynumber":
                            System.out.println("Enter the new value:");
                            oldpolicy.setPolicynumber(scanner.next());
                            break;
                        case "Policyholder":
                            System.out.println("Enter the new value:");
                            scanner.nextLine();
                            oldpolicy.setPolicyholder(scanner.nextLine());
                            break;
                        case "Type":
                            System.out.println("Enter the new value:");
                            oldpolicy.setType(scanner.next());
                            break;
                        case "Coverage":
                            System.out.println("Enter the new value:");
                            oldpolicy.setCoverage(scanner.nextLong());
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Enter the policy type:");
                    String Type=scanner.next();
                    System.out.println("The policy details are:");
                    policies.viewbyType(Type);
                    break;
                case 5:
                    System.out.println("All policies are listed below:");
                        policies.viewAll();
                        break;
                case 6:
                    System.out.println("Exiting!");
                    break;
            }

        }while (choice!=6);

    }

}
