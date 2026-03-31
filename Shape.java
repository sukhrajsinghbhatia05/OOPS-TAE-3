abstract class Shape {
    abstract void calculate_area(); [cite: 26]
    void display_info() { System.out.println("This is a shape."); } [cite: 26]
}

class Circle extends Shape {
    void calculate_area() { System.out.println("Circle Area Formula"); } [cite: 27]
}
// Note: Shape s = new Shape(); would cause a compilation error. [cite: 28]
