 // Sagnik Chattopadhyaya --- 16500117034


import java.util.*;
class Test extends Thread{
	public static void main(String sagnik[]){
		Thread t = new Thread();
		System.out.println("Current Thread : "+ t);
		System.out.println("Within Main thread"); 
		ChildThread ct = new ChildThread(); 
		System.out.println("Child Thread : "+ ct);
		ct.start();
	}
}

class ChildThread extends Thread {
    	public void run(){
		System.out.println("Printing from Child thread"); 
        } 
} 
