//Sagnik Chattopadhyaya - 16500117034

import java.awt.*; 
import java.awt.event.*;
class Calculator extends Frame implements ActionListener {
    TextField t1,t2,t3,t4,t5,t6;
    Label l1;
    Button b1,b2,b3,b4,b5;
    Calculator(){
        setLayout(null);
        l1 = new Label("Enter the nos.");
        add(l1);
        l1.setBounds(70,50,75,25);
        t1 = new TextField();
        add(t1);
        t1.setBounds(175,50,50,25);
        t3 = new TextField();
        add(t3);
        t3.setBounds(250,50,50,25);
        b1 = new Button("Add");
        add(b1);
        b1.setBounds(60,100,75,25);
        b1.addActionListener(this);
        
        b3 = new Button("Substract");
        add(b3);
        b3.setBounds(150,100,75,25);
        b3.addActionListener(this);
        
        b4 = new Button("Multiply");
        add(b4);
        b4.setBounds(250,100,75,25);
        b4.addActionListener(this);
        
        b5 = new Button("Divide");
        add(b5);
        b5.setBounds(350,100,75,25);
        b5.addActionListener(this);
                
        
        b2 = new Button("Exit");
        add(b2);
        b2.setBounds(450,100,75,25);
        b2.addActionListener(this);
        
        t2 = new TextField();
        add(t2);
        t2.setBounds(60,150,150,25);
        
        t4 = new TextField();
        add(t4);
        t4.setBounds(60,190,150,25);
        
        t5 = new TextField();
        add(t5);
        t5.setBounds(60,230,150,25);
        
        t6 = new TextField();
        add(t6);
        t6.setBounds(60,270,150,25);
        
        setSize(200,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t3.getText());
            t2.setText("Addition:"+(x+y));
        }
        else if (ae.getSource() == b3){
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t3.getText());
            t4.setText("Substraction:"+(x-y));
        }
        else if (ae.getSource() == b4){
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t3.getText());
            t5.setText("Multiplication:"+(x*y));
        }
        else if (ae.getSource() == b5){
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t3.getText());
            t6.setText("Division:"+(x/y));
        }
        else if(ae.getSource() == b2)
            System.exit(0);
    }
    public static void main(String ts7[]){
        Calculator cal = new Calculator();
    }
}

