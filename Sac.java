//Sagnik Chattopadhyaya - 16500117034
// Java Code to implement Moving string using applet and thread. 

import java.awt.*; 
import java.applet.*; 

public class Sac extends Applet implements Runnable { 
	private String display; 
	private int x, y, flag; 
	Thread t; 

	public void init() 
	{ 
		display = "My name is Sagnik"; 
		x = 700; 
		y = 200; 
		flag = 1; 

		t = new Thread(this, "MyThread"); 
		t.start(); 
	} 
	public void update() 
	{ 

		x = x + 10 * flag; 
		if (x > 300) 
			flag = -1; 
		if (x < 100) 
			flag = 1; 
	} 
	public void run() 
	{ 

		while (true) { 
			repaint(); 

			update(); 
			try { 
				Thread.sleep(100); 
			} 
			catch (InterruptedException ie) { 
				System.out.println(ie); 
			} 
		} 
	} 
	public void paint(Graphics g) 
	{ 
		g.drawString(display, x, y); 
	} 
} 

