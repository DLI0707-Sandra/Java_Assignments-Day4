package premiumcalculation.com;

public class InsurancePolicy
{
    String type;
    long base;
    double risk_factor;
    double premium;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBase() {
        return base;
    }

    public void setBase(long base) {
        this.base = base;
    }

    public double getRisk_factor() {
        return risk_factor;
    }

    public void setRisk_factor(double risk_factor) {
        this.risk_factor = risk_factor;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium()
    {
        this.premium = base*(1+risk_factor);
    }
}
