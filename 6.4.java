 // Sagnik Chattopadhyaya --- 16500117034
//program to implement synchronisation


class Caller implements Runnable{
	String msg;
	Thread t;
	Callme  target;
	Caller (String m,Callme sag){
		//System.out.println("init");		
		target  = sag;
		msg = m;
		t = new Thread(this);
		t.start();
	}
	public void run(){
	//System.out.println("In Caller");		
	target.call(msg);
	}
}

class Callme{
	synchronized void call(String msg){
		System.out.print("[ "+msg);
		try{
			Thread.sleep(200);
		}
		catch(InterruptedException e){
			System.out.print("Interrupted");
		}
		System.out.println(" ]");
	}
}

class CDemo{
	public static void main(String Sagnik[]){
		Callme ob = new Callme();
		Caller t1 = new Caller("Hello",ob);
		//System.out.println("1");
		System.out.println(" isalive t1 ?:"+t1.t.isAlive());
		Caller t2 = new Caller("CSE", ob);//Thread.sleep(200);
		t2.t.setPriority(10);
		System.out.println(" isalive t2 ?:"+t2.t.isAlive());
		Caller t3 = new Caller("Students",ob);
		System.out.println(" isalive t3 ?:"+t3.t.isAlive());
		try{
			t1.t.join();
			//System.out.println("isalive?:"+t2.t.isAlive());
			t2.t.join();
			t3.t.join();
		}
		catch(InterruptedException e){
			System.out.println("Interrupted Exception Found");
		}
	}
}
