 class ThreadA extends Thread
{
  public void run()
  {
    for(int i=0;i<5;i++)
    {
        try
        {
                sleep(1000);
                System.out.println("Thread:"+i);
        }
        catch(InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
  }
} 

class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("THREAD B : " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class GFG {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        // Starting both threads
        threadB.start();
        threadA.start();
    }
}
