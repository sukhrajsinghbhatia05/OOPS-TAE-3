interface Filterable {
    void apply_filter(String type); [cite: 34]
    void reset_filter(); [cite: 34]
}

class ImageProcessor implements Filterable { [cite: 36]
    public void apply_filter(String t) { System.out.println("Filtering image: " + t); } [cite: 38]
    public void reset_filter() { System.out.println("Image reset."); } [cite: 38]
}
