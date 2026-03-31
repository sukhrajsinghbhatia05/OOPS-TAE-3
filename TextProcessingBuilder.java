class TextProcessingBuilder 
{
    public static void main(String[] args) 
    {
        // StringBuilder is faster than StringBuffer but not thread-safe
        StringBuilder sb = new StringBuilder("Data");

        sb.append(" Processing");
        
        System.out.println("Modified String: " + sb.toString());

        // Comparison:
        // StringBuffer is synchronized (thread-safe).
        // StringBuilder is non-synchronized (faster).
    }
}
