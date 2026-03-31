class Calculator 
{
    // Method overloading with different parameter lists
    void add(int a, int b) 
    {
        System.out.println("Sum of 2 ints: " + (a + b));
    }

    void add(int a, int b, int c) 
    {
        System.out.println("Sum of 3 ints: " + (a + b + c));
    }

    void add(double a, double b) 
    {
        System.out.println("Sum of 2 doubles: " + (a + b));
    }
}
