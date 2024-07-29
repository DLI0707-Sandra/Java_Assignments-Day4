package customermanagement.com;

import policymanagement.com.Policies;
import policymanagement.com.Policy;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerInformationManagement
{
    public static void main(String[] args)
    {
        Customers customers=new Customers();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add new customer\n2.Update details\n3.List all policies of a particular customer\n4.View customers\n5.Exit");
            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter customer details:");
                    System.out.println("Customer number:");
                    String customerID=scanner.next();
                    System.out.println("Customer name:");
                    scanner.nextLine();
                    String customerName=scanner.nextLine();
                    System.out.println("Address:");
                    String address=scanner.next();
                    System.out.println("Phone number:");
                    String phonenumber=scanner.next();
                    System.out.println("Enter number of policies:");
                    int number=scanner.nextInt();
                    ArrayList<CustomerPolicy>customerPolicies=new ArrayList<>();
                    System.out.println("Enter policy details:");
                    for(int i=0;i<number;i++)
                    {
                        System.out.println("Policy number:");
                        String policyNumber=scanner.next();
                        System.out.println("Type:");
                        String policyType=scanner.next();
                        System.out.println("Coverage:");
                        long policyCoverage=scanner.nextLong();
                        CustomerPolicy policy=new CustomerPolicy(policyNumber,policyType,policyCoverage);
                        customerPolicies.add(policy);
                    }
                    Customer customer=new Customer(customerPolicies,phonenumber,address,customerName,customerID);
                    customers.addCustomer(customer);
                    break;
                case 2:
                    System.out.println("Enter the customer id of the customer whose details are to be updated:");
                    String customerid=scanner.next();
                    Customer customer1=customers.findusingID(customerid);
                    System.out.println("Enter the field:");
                    String field=scanner.next();
                    switch(field)
                    {
                        case "Id":
                            System.out.println("Enter the new value:");
                            customer1.setCustomerID(scanner.next());
                                break;
                        case "Name":System.out.println("Enter the new value:");
                            customer1.setName(scanner.next());
                            break;
                        case "Address":
                            System.out.println("Enter the new value:");
                            customer1.setAddress(scanner.next());
                            break;
                        case "Phonenumber":
                            System.out.println("Enter the new value:");
                            customer1.setPhonenumber(scanner.next());
                            break;
                        case "Policies" :
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the customer:");
                    scanner.nextLine();
                    String name=scanner.nextLine();
                    Customer customer2=customers.find(name);
                    customers.displayPolicies(customer2);
                    break;
                case 4:
                        customers.viewCustomer();
                        break;
                case 5:
                    System.out.println("Exiting!");
                    break;
            }

        }while (choice!=5);

    }
}
