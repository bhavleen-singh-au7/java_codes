//creating label, textField, and button components in side a frame

import java.awt.*;
public class SimpleG extends Frame
{
	SimpleG()
	{
		Label lb=new Label("user id");
		add(lb);
		TextField tf=new TextField();
		add(tf);
		Button b=new Button("Button");
		b.setBounds(50,50,50,50);
		add(b);
		
		setSize(500,300);
		setTitle("this is my first awt example");
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String arr[])
	{
		SimpleG fr=new SimpleG();
	}
}