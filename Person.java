class Person {
    String name; [cite: 3]
    int age; [cite: 3]

    // Constructor [cite: 4]
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age); [cite: 4]
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25); [cite: 4]
        Person p2 = new Person("Bob", 30); [cite: 4]
        p1.display(); [cite: 4]
        p2.display(); [cite: 4]
    }
}
