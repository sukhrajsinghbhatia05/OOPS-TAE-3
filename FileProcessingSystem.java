class FileProcessingSystem 
{
    public static void main(String[] args) 
    {
        try 
        {
            System.out.println("Reading file...");
            // Simulate file logic
        }
        catch (Exception e) 
        {
            System.out.println("Error reading file");
        }
        finally 
        {
            // Finally block always runs, used for cleanup
            System.out.println("Closing file resources");
        }
    }
}
