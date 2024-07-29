package customermanagement.com;

import java.util.ArrayList;

public class Customers
{
    ArrayList<Customer> customers=new ArrayList<>();

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public void viewCustomer()
    {
        for(int i=0;i<customers.size();i++)
        {
            System.out.println(customers.get(i));
        }
    }

    public Customer find(String name)
    {
        for(int i=0;i<customers.size();i++)
        {
            if(customers.get(i).name.equals(name))
                return customers.get(i);
        }
        return null;
    }

    public Customer findusingID(String id)
    {
        for(int i=0;i<customers.size();i++)
        {
            if(customers.get(i).customerID.equals(id))
                return customers.get(i);
        }
        return null;
    }

    public void displayPolicies(Customer customer)
    {
        for(int i=0;i<customers.size();i++)
        {
            if(customers.get(i)==customer)
            {
                for (int j=0;j<customer.policies.size();j++)
                {
                    System.out.println(customer.policies.get(j));
                }

            }
        }
    }
}
