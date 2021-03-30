import java.awt.*;
import java.awt.event.*;		//for actionListner
class Kuch extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6;
	TextField tf1,tf2,tf3,tf4,tf5,tf6;
	Button bt;
	Kuch()
	{
		
		l1=new Label("Current Meter Reading");
		add(l1);
		l1.setBounds(120,30,150,20);
		tf1=new TextField();
		tf1.setBounds(120,60,150,20);
		add(tf1);
		
		l2=new Label("Previous Meter Reading");
		add(l2);
		l2.setBounds(120,90,150,20);
		tf2=new TextField();
		tf2.setBounds(120,120,150,20);
		add(tf2);
		
		l3=new Label("Fuel Quantity");
		add(l3);
		l3.setBounds(20,150,150,20);
		tf3=new TextField();
		tf3.setBounds(20,180,150,20);
		add(tf3);
		
		l4=new Label("Total Fuel Price");
		add(l4);
		l4.setBounds(200,150,150,20);
		tf4=new TextField();
		tf4.setBounds(200,180,150,20);
		add(tf4);
		
		l5=new Label("YOUR MILLEAGE");
		add(l5);
		l5.setBounds(120,210,150,20);
		tf5=new TextField();
		tf5.setBounds(120,240,150,20);
		tf5.setEditable(false);
		add(tf5);
		
		l6=new Label("COST PER LITRE");
		add(l6);
		l6.setBounds(120,270,150,20);
		tf6=new TextField();
		tf6.setBounds(120,300,150,20);
		tf6.setEditable(false);
		add(tf6);
		
		bt=new Button("Calculate Mileage");
		bt.setBounds(120,330,150,50);
		add(bt);
		bt.addActionListener(this);	//isse kya hota hai
		
		setSize(370,400);
		setTitle("Mileage Calculator");
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
		String s2=tf2.getText();
		String s3=tf3.getText();
		String s4=tf4.getText();
		double a=Double.parseDouble(s1);
		double b=Double.parseDouble(s2);
		double c=Double.parseDouble(s3);
		double d=Double.parseDouble(s4);
		double milleage=0;
		double cost=0;
		
		if(e.getSource()==bt)
		{
			milleage=(a-b)/c;
			cost=d/milleage;
		}
		
		String result1=String.valueOf(milleage);
		tf5.setText(result1);	
		
		String result2=String.valueOf(cost);
		tf6.setText(result2);	
	}
	public static void main(String[] arr)
	{
		new Kuch();
	}
}