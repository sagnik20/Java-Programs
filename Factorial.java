import java.awt.*; 
import java.awt.event.*;
class Factorial extends Frame implements ActionListener {
    TextField t1,t2,t3,t4,t5,t6;
    Label l1;
    Button b1,b2,b3,b4,b5;
    Factorial(){
        setLayout(null);
        l1 = new Label("Enter the nos : ");
        add(l1);
        l1.setBounds(70,50,75,25);
        t1 = new TextField();
        add(t1);
        t1.setBounds(175,50,50,25);
        
        b1 = new Button("Factorial");
        add(b1);
        b1.setBounds(60,100,75,25);
        b1.addActionListener(this);   
        
        b2 = new Button("Exit");
        add(b2);
        b2.setBounds(450,100,75,25);
        b2.addActionListener(this);
        
        t2 = new TextField();
        add(t2);
        t2.setBounds(60,150,150,25);
        
        setSize(200,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            int fact=1,x = Integer.parseInt(t1.getText());
            for(int i=x;i>1;i--)
                fact *= i;
            t2.setText("Factorial:"+fact);
        }
        else if(ae.getSource() == b2)
            System.exit(0);
    }
    public static void main(String sagnik[]){
        Factorial cal = new Factorial();
    }
}

