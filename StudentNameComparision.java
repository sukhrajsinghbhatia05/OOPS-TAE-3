import java.util.Scanner;

class StudentNameComparison 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter name 2: ");
        String name2 = sc.nextLine();

        // equals() performs a case-sensitive check
        System.out.println("Case-sensitive comparison: " + name1.equals(name2));

        // equalsIgnoreCase() ignores capital/small letter differences
        System.out.println("Case-insensitive comparison: " + name1.equalsIgnoreCase(name2));
    }
}
