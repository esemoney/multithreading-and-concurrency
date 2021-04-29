package unsynchronizedThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors; 
public class Demo 
{
    public static void main(String[] args)
    {
        SimpleArray sharedArray = new SimpleArray();
        
        ArrayWriter writer1 = new ArrayWriter(sharedArray, 1);
        ArrayWriter writer2 = new ArrayWriter(sharedArray, 11);   
        
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(writer1);
        executor.execute(writer2);
    }        
}
