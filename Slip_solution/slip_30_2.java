import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class division extends Frame implements ActionListener
{
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Button b1;
    division()
    {
       setVisible(true);
       setSize(500,500);
       setLayout(new FlowLayout());

       l1=new Label("Number1");
       l2=new Label("Number2");
       l3=new Label("Result");
       t1=new TextField(10);
       t2=new TextField(10);
       t3=new TextField(10);
       b1=new Button("Division");
       add(l1);add(t1);add(l2);add(t2);
       add(l3);add(t3);add(b1);
       b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
      try {
          if(ae.getSource()==b1)
          {
              int a=Integer.parseInt(t1.getText());
              int b=Integer.parseInt(t2.getText());
              int c=a/b;
              t3.setText(""+c);
          }
      }
       catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this,"Error"+e);
      }
      catch (ArithmeticException e) {
         JOptionPane.showMessageDialog(this,"Error"+e);
      }
    }
}
class demo
{
    public static void main(String[] args) {
        new division();
    }
}