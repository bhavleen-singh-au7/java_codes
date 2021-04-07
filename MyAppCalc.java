import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
//<applet code="MyAppCalc" width="400" height="400"> </applet>
class MyAppCalc extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
//	public void init()
	MyAppCalc()
	{
		t1=new TextField();
		t1.setBounds(10,50,380,50);
		add(t1);
		
		t2=new TextField();
		t2.setBounds(10,100,380,50);
		add(t2);
		
		t3=new TextField();
		t3.setBounds(10,150,380,50);
		t3.setEditable(false);
		add(t3);
		
		b1=new Button("+");
		b1.setBounds(20,200,70,50);
		add(b1);
		
		
		b2=new Button("-");
		b2.setBounds(90,200,70,50);
		add(b2);
		
		b3=new Button("*");
		b3.setBounds(160,200,70,50);
		add(b3);
		
		b4=new Button("/");
		b4.setBounds(230,200,70,50);
		add(b4);
		
		b5=new Button("%");
		b5.setBounds(300,200,70,50);
		add(b5);
		
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String[] arr)
	{
		new MyAppCalc();
	}
}
