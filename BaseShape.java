class BaseShape 
{
    void display() 
    {
        System.out.println("General Shape Info");
    }
}

class Square extends BaseShape 
{
    void area(int s) { System.out.println("Area: " + (s * s)); }
}

class Triangle extends BaseShape 
{
    void area(int b, int h) { System.out.println("Area: " + (0.5 * b * h)); }
}
