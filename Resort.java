class Resort 
{
    int RNo, Days;
    String Name;
    float Charges;

    // Calculate and return amount
    float Compute() 
    {
        float amount = Days * Charges;
        if (amount > 11000) 
        {
            return 1.02f * amount;
        }
        return amount;
    }

    void Getinfo(int r, String n, float c, int d) 
    {
        RNo = r;
        Name = n;
        Charges = c;
        Days = d;
    }

    void DispInfo() 
    {
        System.out.println("Room: " + RNo + " Name: " + Name + " Total: " + Compute());
    }
}
