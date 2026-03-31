interface Filterable 
{
    void apply_filter(String filter_type);
    void reset_filter();
}

class ImageProcessor implements Filterable 
{
    public void apply_filter(String type) 
    {
        System.out.println("Applying " + type + " to Image.");
    }

    public void reset_filter() 
    {
        System.out.println("Image Filter Reset.");
    }
}

class DataAnalyzer implements Filterable 
{
    public void apply_filter(String type) 
    {
        System.out.println("Applying " + type + " to Data.");
    }

    public void reset_filter() 
    {
        System.out.println("Data Filter Reset.");
    }
}
