class Person 
{
    String name;
    int age;

    // Constructor to set attributes upon object creation
    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    // Method to print details
    void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) 
    {
        // Creating two Person objects
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        
        p1.display();
        p2.display();
    }
}
