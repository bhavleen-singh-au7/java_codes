import java.awt.*;
import java.awt.event.*;
public class TextDoc extends Frame implements ActionListener
{
	Label l1,l2;
	TextArea area;
	Button bt;
	TextDoc()
	{
		l1=new Label();
		l1.setBounds(50,50,100,30);
		
		l2=new Label();
		l2.setBounds(160,50,100,30);
		
		area=new TextArea("my name is bhavleen");
		area.setBounds(20,100,300,300);
		
		bt=new Button("Count Words");
		bt.setBounds(100,400,100,30);
		bt.addActionListener(this);
		add(l1); add(l2); add(area); add(bt);
		
		setSize(400,450);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String text=area.getText();
		String words[]=text.split("\\s"); // \\s = = reading the spaces
		l1.setText("words: "+words.length);
		l2.setText("Character: "+text.length());
	}
	public static void main(String[] arr)
	{
		new TextDoc();
	}
}