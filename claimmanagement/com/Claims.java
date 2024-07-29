package claimmanagement.com;

import java.util.ArrayList;

public class Claims
{
    ArrayList<Claim>claims=new ArrayList<>();

    public void addClaims(Claim claim)
    {
        claims.add(claim);
    }

    public void display()
    {
        for(int i=0;i<claims.size();i++)
        {
            System.out.println(claims.get(i));
        }
    }

    public Claim find(int claimnumber)
    {
        for(int i=0;i<claims.size();i++)
        {
            if(claims.get(i).claimNumber==claimnumber)
                return claims.get(i);
        }
        return null;
    }
}
