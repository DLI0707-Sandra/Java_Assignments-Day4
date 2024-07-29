package claimmanagement.com;

import java.util.Scanner;

public class ClaimManagement
{
    public static void main(String[] args)
    {
        int choice;
        Claims claims=new Claims();
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("1.Add claims\n2.Update status\n3.Generate reports\n4.Exit");
            System.out.println("Enter your choice:");
            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    Claim claim=new Claim();
                    System.out.println("Enter the details:");
                    System.out.println("Enter the claim number:");
                    claim.setClaimNumber(scanner.nextInt());
                    System.out.println("Enter the policy number:");
                    claim.setPolicyNumber(scanner.next());
                    System.out.println("Enter the name:");
                    scanner.nextLine();
                    claim.setName(scanner.nextLine());
                    System.out.println("Amount:");
                    claim.setAmount(scanner.nextLong());
                    System.out.println("Enter the status:");
                    String status=scanner.next();
                    switch (status) {
                        case "pending":
                            Claim.Status newstatus = Claim.Status.pending;
                            claim.setStatus(newstatus);
                            break;
                        case "approved":
                            Claim.Status new_status = Claim.Status.approved;
                            claim.setStatus(new_status);
                            break;
                        case "rejected":
                            Claim.Status newstatus_ = Claim.Status.rejected;
                            claim.setStatus(newstatus_);
                            break;
                    }
                    claims.addClaims(claim);
                    break;
                case 2:
                    System.out.println("Enter the claim number whose status is to be updated:");
                    Claim old=claims.find(scanner.nextInt());
                    System.out.println("Enter the new status:");
                    String new_status_=scanner.next();
                    switch (new_status_)
                    {
                        case "pending":
                                        Claim.Status newstatus= Claim.Status.pending;
                                        old.setStatus(newstatus);
                                        break;
                        case "approved":
                            Claim.Status new_status = Claim.Status.approved;
                            old.setStatus(new_status);
                            break;
                        case "rejected":
                            Claim.Status newstatus_ = Claim.Status.rejected;
                            old.setStatus(newstatus_);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("All claims:");
                    claims.display();
                    break;
                case 4:
                    System.out.println("Exiting!");
                    break;
            }
        }while (choice!=4);
    }
}
