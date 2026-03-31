class BankingSystem 
{
    int balance = 1000;

    void withdraw(int amt) 
    {
        // Using synchronized block on the current object
        synchronized(this) 
        {
            if (balance >= amt) 
            {
                balance -= amt;
                System.out.println("Balance deduction: " + amt);
            }
        }
    }

    public static void main(String[] args) 
    {
        BankingSystem bank = new BankingSystem();
        new Thread(() -> bank.withdraw(500)).start();
        new Thread(() -> bank.withdraw(200)).start();
    }
}
