import java.awt.*;
import java.awt.event.*;
class MyNotepad extends Frame
{
	TextArea area;
	MyNotepad()
	{
		area=new TextArea("this is my notepad");
		area.setBounds(30,30,30,30);
		
		MenuBar mb = new MenuBar();
		Menu menu=new Menu("Menu");
		MenuItem i1=new MenuItem("Item 1");
		menu.add(i1);
		mb.add(menu);
		setMenuBar(mb);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] arr)
	{
		new MyNotepad();
	}
}