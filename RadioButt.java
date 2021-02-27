//creation of radio button in java GUI
//grouping of checkboxes creates radio buttons
import java.awt.*;
public class RadioButt extends Frame
{
	RadioButt()
	{
		CheckboxGroup cbg=new CheckboxGroup();
		
		Checkbox checkBox1=new Checkbox("C++ ", cbg,false);
		checkBox1.setBounds(100,100,50,50);
		Checkbox checkBox2=new Checkbox("java ",cbg,true);
		checkBox2.setBounds(100,150,50,50);
		add(checkBox1); add(checkBox2); 
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] arr)
	{
		new RadioButt();
	}
}