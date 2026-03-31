import java.util.Scanner;
import java.util.InputMismatchException;

class StudentInputSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        try 
        {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Student age is: " + age);
        }
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input (Please enter numbers only)");
        }
        catch (Exception e) 
        {
            System.out.println("General Error");
        }
    }
}
