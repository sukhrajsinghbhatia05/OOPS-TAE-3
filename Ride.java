abstract class Ride 
{
    double distance;
    abstract double calculateFare();
}

class BikeRide extends Ride 
{
    double calculateFare() { return distance * 5; }
}

class AutoRide extends Ride 
{
    double calculateFare() { return distance * 8; }
}
