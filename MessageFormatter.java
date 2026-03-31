import java.util.Scanner;

class MessageFormatter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        String fname = sc.next();
        System.out.print("Enter last name: ");
        String lname = sc.next();

        // Concatenating strings using the + operator
        String fullName = fname + " " + lname;

        System.out.println("Full Name: " + fullName);
    }
}
