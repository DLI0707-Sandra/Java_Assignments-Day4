package policymanagement.com;

public class Policy
{
    String policynumber;
    String policyholder;
    String type;
    long coverage;

    public Policy(String policynumber,String policyholder,String type,long coverage)
    {
        this.policynumber=policynumber;
        this.policyholder=policyholder;
        this.type=type;
        this.coverage=coverage;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getPolicyholder() {
        return policyholder;
    }

    public void setPolicyholder(String policyholder) {
        this.policyholder = policyholder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getCoverage() {
        return coverage;
    }

    public void setCoverage(long coverage) {
        this.coverage = coverage;
    }

    @Override
    public String toString() {
        return "Policy Number:"+policynumber+"\nPolicy holder name:"+policyholder+"\nType:"+type+"\nCoverage"+coverage;
    }
}
