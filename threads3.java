//Sagnik Chattopadhyaya - 16500117034

import java.util.*;
class Greetings implements Runnable{
	Thread t;
	Greetings(String name){
		t=new Thread(this,name);
		t.start();
	}
	public void run(){
	    for(int i=0;i<5;i++){
			try{
					if(t.getName()=="Good Morning"){
						System.out.println(t.getName());
						t.sleep(1000);
						t.setPriority(2);
					}
					else if(t.getName()=="Hello"){
						System.out.println(t.getName());
						t.sleep(2000);
						t.setPriority(4);
					}
					else{
						System.out.println(t.getName());
						t.sleep(3000);
					}
			}
			catch(InterruptedException e){}
		}
	}
}
public class threads3{
	public static void main(String sagnik[]) {
		new Greetings("Good Morning");
		new Greetings("Hello");
		new Greetings("Welcome");
	}
}