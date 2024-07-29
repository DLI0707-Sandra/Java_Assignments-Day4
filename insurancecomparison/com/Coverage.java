package insurancecomparison.com;

public class Coverage
{
    String type;
    long amount;
    double premium;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Type:"+type+"\nAmount:"+amount+"\nPremium:"+premium;
    }
}
