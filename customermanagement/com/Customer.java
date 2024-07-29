package customermanagement.com;

import java.util.ArrayList;

public class Customer
{
    String customerID;
    String name;
    String address;
    String phonenumber;
    ArrayList<CustomerPolicy> policies=new ArrayList<>();

    public Customer(ArrayList<CustomerPolicy> policies, String phonenumber, String address, String name, String customerID) {
        this.policies = policies;
        this.phonenumber = phonenumber;
        this.address = address;
        this.name = name;
        this.customerID = customerID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public ArrayList<CustomerPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(ArrayList<CustomerPolicy> policies) {
        this.policies = policies;
    }

    @Override
    public String toString() {
        return "Customer ID:"+customerID+"\nCustomer name:"+name+"\nAddress:"+address+"\nPhonenumber:"+phonenumber;
    }
}
