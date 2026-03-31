class Restaurant 
{
    boolean foodReady = false;

    synchronized void produce() 
    {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify(); // Wake up the waiter
    }

    synchronized void consume() 
    {
        try 
        {
            while (!foodReady) wait(); // Wait until chef is done
            System.out.println("Waiter served food");
        }
        catch (InterruptedException e) {}
    }

    public static void main(String[] args) 
    {
        Restaurant r = new Restaurant();
        new Thread(() -> r.consume()).start();
        new Thread(() -> r.produce()).start();
    }
}
