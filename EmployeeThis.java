class EmployeeThis 
{
    String name;
    double salary;

    EmployeeThis(String name, double salary) 
    {
        // Using 'this' to assign constructor parameters to object variables
        this.name = name;
        this.salary = salary;
    }

    void display() 
    {
        System.out.println("Name: " + name + " Salary: " + salary);
    }
}
