class Student 
{
    int id;
    String name;

    Student(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    // Overriding toString() to display object content instead of memory address
    @Override
    public String toString() 
    {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) 
    {
        Student s1 = new Student(101, "Aryan");
        System.out.println(s1.toString());
    }
}
