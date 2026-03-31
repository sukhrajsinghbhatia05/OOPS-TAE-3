class EmployeeCounter 
{
    String name;
    int id;
    static int employeeCount = 0;

    EmployeeCounter(String name, int id) 
    {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void showTotal() 
    {
        System.out.println("Total Employees: " + employeeCount);
    }
}
