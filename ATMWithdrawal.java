import java.util.Scanner;

class ATMWithdrawal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double balance = 2000.0;

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try 
        {
            if (amount > balance) 
            {
                // Throwing a manual exception for business logic
                throw new Exception("Insufficient Balance");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
