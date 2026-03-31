class PersonRole 
{
    void role() { System.out.println("Person Role"); }
}

class EmployeeRole extends PersonRole 
{
    void role() { System.out.println("Employee Role"); }
}

class ManagerRole extends EmployeeRole 
{
    void role() { System.out.println("Manager Role"); }
}
