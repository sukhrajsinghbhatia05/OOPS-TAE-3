class ChatThread extends Thread 
{
    public void run() 
    {
        System.out.println(Thread.currentThread().getName() + ": Message processing");
    }

    public static void main(String[] args) 
    {
        ChatThread sender = new ChatThread();
        sender.setName("Sender");
        
        System.out.println("State: " + sender.getState()); // NEW
        sender.start();
        System.out.println("State: " + sender.getState()); // RUNNABLE/RUNNING
    }
}
