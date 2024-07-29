package claimmanagement.com;

public class Claim
{
    public enum Status {pending,approved,rejected};
    int claimNumber;
    String policyNumber;
    String name;
    long amount;
    Status status;

    public Claim()
    {

    }

    public Claim(int claimNumber, String policyNumber, String name, long amount, Status status) {
        this.claimNumber = claimNumber;
        this.policyNumber = policyNumber;
        this.name = name;
        this.amount = amount;
        this.status = status;
    }

    public int getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(int claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim number:"+claimNumber+"\nPolicy number:"+policyNumber+"\nClaiment's name:"+name+"\nAmount:"+amount+"\nStatus:"+status;
    }
}
