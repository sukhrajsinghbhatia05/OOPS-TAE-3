interface Bank 
{
    float getInterestRate();
}

class SBI implements Bank 
{
    public float getInterestRate() { return 5.0f; }
}

class HDFC implements Bank 
{
    public float getInterestRate() { return 6.0f; }
}

class ICICI implements Bank 
{
    public float getInterestRate() { return 5.5f; }
}
