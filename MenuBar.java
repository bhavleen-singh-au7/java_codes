import java.awt.*;
class MenuBar1 extends Frame
{
	MenuBar1()
	{
		MenuBar mb=new MenuBar();
		Menu menu=new Menu("Menu");
		Menu submenu=new Menu("Sub Menu");
		MenuItem i1=new MenuItem("Item 1");
		MenuItem i2=new MenuItem("Item 2");
		MenuItem i3=new MenuItem("Item 3");
		MenuItem i4=new MenuItem("Item 4");
		MenuItem i5=new MenuItem("Item 5");
		
		menu.add(i1); menu.add(i2); menu.add(i3); submenu.add(i4); submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
		setMenuBar(mb);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String arr[])
	{
		new MenuBar1();
	}
}