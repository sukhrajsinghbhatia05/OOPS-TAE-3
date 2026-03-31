class DownloadTask implements Runnable 
{
    String fileName;
    
    DownloadTask(String name) 
    {
        this.fileName = name;
    }

    public void run() 
    {
        System.out.println("Downloading: " + fileName);
    }
}

class DownloadManager 
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new DownloadTask("setup.exe"));
        Thread t2 = new Thread(new DownloadTask("video.mp4"));

        t1.start();
        t2.start();
    }
}
