abstract class Shape 
{
    abstract void calculate_area();
    
    void display_info() 
    {
        System.out.println("This is a concrete method in an abstract class.");
    }
}

class Circle extends Shape 
{
    void calculate_area() 
    {
        System.out.println("Calculating Circle Area...");
    }
}
