import java.util.Scanner;

class PasswordMaskingSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (pass.length() > 2) 
        {
            // Keep last 2 characters, replace others with '*'
            String hidden = pass.substring(0, pass.length() - 2).replaceAll(".", "*");
            String lastTwo = pass.substring(pass.length() - 2);
            
            System.out.println("Masked Password: " + hidden + lastTwo);
        }
    }
}
