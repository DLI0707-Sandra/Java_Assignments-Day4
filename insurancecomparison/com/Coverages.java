package insurancecomparison.com;

import java.util.ArrayList;

public class Coverages
{
    ArrayList<Coverage>coverages=new ArrayList<>();

    public void addOptions(Coverage coverage)
    {
        coverages.add(coverage);
    }

    public void display()
    {
        for(int i=0;i<coverages.size();i++)
        {
            System.out.println(coverages.get(i));
        }
    }

    public void findBestPremium()
    {
        double smallest=coverages.get(0).premium;
        Coverage smallest_coverage=coverages.get(0);
        for(int i=1;i<coverages.size();i++)
        {
            if(coverages.get(i).premium<smallest)
            {
                smallest=coverages.get(i).premium;
                smallest_coverage=coverages.get(i);
            }
        }

        System.out.println("Coverage with lowest premium:"+smallest_coverage);
    }

    public void findbestAmount()
    {
        double largest=coverages.get(0).amount;
        Coverage largest_amount=coverages.get(0);
        for(int i=1;i<coverages.size();i++)
        {
            if(coverages.get(i).amount>largest)
            {
                largest=coverages.get(i).amount;
                largest_amount=coverages.get(i);
            }
        }

        System.out.println("Coverage with highest amount:"+largest_amount);
    }

    public ArrayList<String> getTypes()
    {
        ArrayList<String>types=new ArrayList<>();
        for (int i=0;i<coverages.size();i++)
        {
            if(!types.contains(coverages.get(i).type))
                types.add(coverages.get(i).type);
        }
        return types;
    }

    public void printbest(String type)
    {
        double largest=0.0;
        Coverage largest_amount=null;
        for(int i=0;i<coverages.size();i++)
        {
            if(coverages.get(i).amount>largest&&coverages.get(i).type.equals(type))
            {
                largest=coverages.get(i).amount;
                largest_amount=coverages.get(i);
            }
        }

        System.out.println("Coverage with highest amount of "+type+":"+largest_amount);
    }
}
