class MusicPlayer extends Thread 
{
    public void run() 
    {
        System.out.println("Playing song...");
        try 
        {
            for (int i = 1; i <= 3; i++) 
            {
                System.out.println("Progress " + i);
                Thread.sleep(1000); // Wait for 1 second
            }
        }
        catch (InterruptedException e) 
        {
            System.out.println("Player Interrupted");
        }
    }

    public static void main(String[] args) 
    {
        MusicPlayer t1 = new MusicPlayer();
        t1.start();
    }
}
