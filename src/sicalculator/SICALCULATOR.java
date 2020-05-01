package sicalculator;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SICALCULATOR extends Frame implements ActionListener {
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button b1,b2;
    public SICALCULATOR() {
        l1 = new Label("principal");
        l2 = new Label("rate");
        l3 = new Label("time");
        l4 = new Label("result");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t4 = new TextField(10);
        b1 = new Button("calculate");
        b2 = new Button("exit");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(b1);
        add(b2);
        setSize(200,300);
        setTitle("SI-CALCULATOR");
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);



    }
    public void actionPerformed(ActionEvent ae) {
        double a=0,b=0,c=0,d=0;
        try {
            a=Double.parseDouble(t1.getText());
        }
        catch (NumberFormatException e){
            t1.setText("invalid output");
        }
        try{
            b=Double.parseDouble(t2.getText());
        }
        catch(NumberFormatException e) {
            t2.setText("invalid output");
        }
        try{
            c=Double.parseDouble(t3.getText());
        }
        catch(NumberFormatException e) {
            t3.setText("invalid output");
        }
        if(ae.getSource()==b1) {
            d=(a*b*c)/100;
            t4.setText(String.valueOf(d));
        }
        if(ae.getSource()==b2) {
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
            t4.setText("0");

        }
    }

    public static void main(String[] args) {
        SICALCULATOR obj = new SICALCULATOR();
        obj.setVisible(true);
        obj.setLocation(300,300);
    }


}
