import java.awt.*;
import java.awt.event.*;
public class Scrollbar1 extends Frame
{
	Scrollbar1()
	{
		Label label=new Label();
		label.setSize(500,100);
		
		Scrollbar s=new Scrollbar();
		s.setBounds(100,100,50,100);
		
		add(s); add(label);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		s.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				label.setText("    Vertical Scrollbar value is: "+s.getValue());
			}
		});
	}
	public static void main(String[] arr)
	{
		new Scrollbar1();
	}
}