class Rectangle {
    int length, breadth;
    Rectangle(int l, int b) { length = l; breadth = b; } [cite: 24]
    int Area() { return length * breadth; } [cite: 24]

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5); [cite: 24]
        Rectangle r2 = new Rectangle(5, 8); [cite: 24]
        System.out.println("Area 1: " + r1.Area());
        System.out.println("Area 2: " + r2.Area());
    }
}
