class RailwayReservation 
{
    int seats = 1;

    // synchronized prevents two threads from booking the same seat
    synchronized void book(String name) 
    {
        if (seats > 0) 
        {
            System.out.println(name + ": Ticket booked successfully");
            seats--;
        }
        else 
        {
            System.out.println(name + ": No tickets available");
        }
    }

    public static void main(String[] args) 
    {
        RailwayReservation obj = new RailwayReservation();
        
        Thread p1 = new Thread(() -> obj.book("User A"));
        Thread p2 = new Thread(() -> obj.book("User B"));

        p1.start();
        p2.start();
    }
}
