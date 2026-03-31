import java.util.Scanner;

class EmailChecker 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        // contains() checks if the specific substring exists in the email
        if (email.contains("@gmail.com")) 
        {
            System.out.println("Valid Gmail Address");
        }
        else 
        {
            System.out.println("Invalid Email");
        }
    }
}
