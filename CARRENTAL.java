class CARRENTAL 
{
    int CarId;
    String CarType;
    float Rent;

    // Method to accept ID and Type
    void GetCar(int id, String type) 
    {
        this.CarId = id;
        this.CarType = type;
        this.Rent = GetRent();
    }

    // Method to return rent based on car type
    float GetRent() 
    {
        if (CarType.equalsIgnoreCase("Small Car")) 
        {
            return 1000;
        }
        else if (CarType.equalsIgnoreCase("Van")) 
        {
            return 800;
        }
        else if (CarType.equalsIgnoreCase("SUV")) 
        {
            return 2500;
        }
        return 0;
    }

    // Method to view contents
    void ShowCar() 
    {
        System.out.println("ID: " + CarId + " Type: " + CarType + " Rent: " + Rent);
    }
}
