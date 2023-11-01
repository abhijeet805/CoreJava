import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class table extends Frame implements ActionListener
{
    Label l1,l2;
    List lst;
    Button b1;
    TextField t1;
     table()
     {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout()); 
        l1=new Label("Enter no");
        l2=new Label("Table");
        t1=new TextField(10);
        lst=new List();
        b1=new Button("OK");

        add(l1);add(t1);add(l2);add(lst);add(b1);
       b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1){
        int num=Integer.parseInt(t1.getText());
        for (int i = 1; i <=10; i++) {
            lst.add(""+i*num);
        }
        }
    }

public static void main(String[] args) {
    new table();
}
}
