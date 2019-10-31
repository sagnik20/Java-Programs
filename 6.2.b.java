 // Sagnik Chattopadhyaya --- 16500117034


import java.util.*;
class MyThread implements Runnable {
    private int threadId;
    private int delay;
    MyThread(int id,int d){
      threadId = id;
      delay = d;//time for which thread sleeps
    }

     public void run(){
         for(int i=0;i<5;i++){
            System.out.println("Thread "+ threadId +" is running");
            try{

               Thread.sleep(delay);
            }
            catch(InterruptedException e){
               e.printStackTrace();
            }
        }
        System.out.println("Thread "+ threadId +" is Finished");
     }
}
class RunnableThread {
    public static void main(String[] args){
        System.out.println("Main thread starts");
        MyThread r1 = new MyThread(1,50);
        
        Thread t1 = new Thread(r1);
        
        t1.start();
        
        System.out.println("Main thread is finished");
    }
} 
