import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Border extends Frame implements ActionListener{
     Button b1,b2,b3,b4,b5;
     Label l1,l2,l3;
     TextField t1,t2,t3;
     Panel p1;
     Border(){
        setVisible(true);
        setSize(500,300);
        b1=new Button("Add");
        b2=new Button("sub");
        b3=new Button("Mul");
        b4=new Button("Div");
        l1=new Label("enter no1:");
        l2=new Label("enter no2:");
        l3=new Label("Result:"); 
        t1=new TextField(10); 
        t2=new TextField(10); 
        t3=new TextField(10);
       
        add(b1,BorderLayout.SOUTH);
        add(b2,BorderLayout.NORTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        
       p1=new Panel();
       p1.setLayout(new GridLayout(3,2));
       p1.add(l1);p1.add(t1);p1.add(l2);p1.add(t2);
       p1.add(l3);p1.add(t3);

       add(p1,BorderLayout.CENTER);

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==b1)
       {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a+b;
        t3.setText(""+c);
       }
       
       if(ae.getSource()==b2)
       {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a-b;
        t3.setText(""+c);
       }
       if(ae.getSource()==b3)
       {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a*b;
        t3.setText(""+c);
       }
       if(ae.getSource()==b4)
       {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a/b;
        t3.setText(""+c);
       }
       
    }
    public static void main(String[] args) {
        new Border();
    }
}
