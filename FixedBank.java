class FixedBank 
{
    final double interestRate = 7.0;

    void calculateInterest(double amount) 
    {
        System.out.println("Interest: " + (amount * interestRate / 100));
    }
}
