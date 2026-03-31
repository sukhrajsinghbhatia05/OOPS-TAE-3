abstract class Staff 
{
    String name;
    int id;
    abstract void calculateBonus(double salary);
}

class Manager extends Staff 
{
    void calculateBonus(double salary) 
    {
        System.out.println("Manager Bonus: " + (0.2 * salary));
    }
}

class Developer extends Staff 
{
    void calculateBonus(double salary) 
    {
        System.out.println("Developer Bonus: " + (0.1 * salary + 500));
    }
}
