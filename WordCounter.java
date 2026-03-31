import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // StringTokenizer breaks the string into tokens (words)
        StringTokenizer st = new StringTokenizer(sentence);
        
        System.out.println("Total words: " + st.countTokens());
    }
}
