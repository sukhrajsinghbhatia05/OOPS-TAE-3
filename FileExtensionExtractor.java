import java.util.Scanner;

class FileExtensionExtractor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file name (e.g. report.pdf): ");
        String fileName = sc.nextLine();

        // find the position of the last dot
        int dotIndex = fileName.lastIndexOf(".");
        
        if (dotIndex != -1) 
        {
            // substring(index + 1) gets everything after the dot
            String extension = fileName.substring(dotIndex + 1);
            System.out.println("Extension: " + extension);
        }
    }
}
