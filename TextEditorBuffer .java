class TextEditorBuffer 
{
    public static void main(String[] args) 
    {
        // StringBuffer is used for strings that change frequently
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");           // Adds to the end
        sb.insert(5, " Java");        // Adds at specific index
        sb.reverse();                 // Flips the string
        
        System.out.println("Final Result: " + sb.toString());
    }
}
