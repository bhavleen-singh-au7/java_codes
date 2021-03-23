import java.awt.*;
import java.awt.event.*;
public class ListEx extends Frame
{
	ListEx()
	{
		Label label=new Label();
		
		label.setSize(500,100);
		Button b=new Button("Show");
		b.setBounds(200,150,80,30);
		List l1=new List(4, false);
		l1.setBounds(100,100,70,70);
		l1.add("c");
		l1.add("c++");
		l1.add("java");
		l1.add("php");
		List l2=new List(4, true);
		l2.setBounds(100,200,70,70);
		l2.add("turbo c");
		l2.add("spring");
		l2.add("hibernate");
		l2.add("CodeIgniter");
		add(l1); add(l2); add(label); add(b);
		setSize(450,450);
		setLayout(null);
		setVisible(true);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String data = "   Programming language Selected: "+l1.getItem(l1.getSelectedIndex());
				data+=", Framework Selected: ";
				for(String a:l2.getSelectedItems()){
					data+=a+" ";
				}
				label.setText(data);
			}
		});
	}
	public static void main(String[] arr)
	{
		new ListEx();
	}
}
