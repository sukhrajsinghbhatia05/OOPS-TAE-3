class BankApplication 
{
    // Declaring that this method might throw an exception
    static void checkTransaction(int amount) throws Exception 
    {
        if (amount <= 0) 
        {
            throw new Exception("Invalid Amount");
        }
        System.out.println("Transaction processed");
    }

    public static void main(String[] args) 
    {
        try 
        {
            checkTransaction(-50);
        }
        catch (Exception e) 
        {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }
}
