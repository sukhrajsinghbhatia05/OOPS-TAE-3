class c {
    int CarId; [cite: 8]
    String CarType; [cite: 8]
    float Rent; [cite: 8]

    void GetCar(int id, String type) { [cite: 9]
        CarId = id; CarType = type;
        Rent = GetRent();
    }

    float GetRent() { [cite: 10]
        if (CarType.equals("Small Car")) return 1000;
        if (CarType.equals("Van")) return 800;
        if (CarType.equals("SUV")) return 2500;
        return 0;
    }

    void ShowCar() { [cite: 11]
        System.out.println("ID: " + CarId + " Type: " + CarType + " Rent: " + Rent);
    }
}
