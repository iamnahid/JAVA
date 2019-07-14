import java.awt.*;
import java.awt.event.*;
class WindowSensor extends WindowAdapter{
	public void windowClosing(WindowEvent we){

	System.out.println("Window is closing");

		System.exit(0);
		
	}
	
}

class MyFrame extends Frame{
	public MyFrame(){
		
		super("Java First Window");
		Button b = new Button("OK");
		add(b);
		setSize(500,900);
		b.addActionListener(new ButtonSensor());
		
		this.addMouseListener(new MouseSensor());
		this.addMouseMotionListener(new MouseSensor());
		setLayout(new FlowLayout());
		
		
	}
	
}

class ButtonSensor implements ActionListener
{	
	static int counter;
	public void actionPerformed(ActionEvent ae)
	{
		counter++ ;
		System.out.println("Button Clicked"+counter);
		
	}
}

class MouseSensor extends MouseAdapter
{	
	public void mouseDragged( MouseEvent e)
	{
		System.out.println("Mouse Dragged"+" x="+e.getX()+"\ty"+e.getY());
		
	}
	
	public void mousePressed( MouseEvent e)
	{
		System.out.println("Mouse Pressed"+" x="+e.getX()+"\ty"+e.getY());
		
	}
	
	public void mouseMoved( MouseEvent e)
	{
		System.out.println("Mouse Moved"+" x="+e.getX()+"\ty"+e.getY());
		
	}
}


class GuiTest {
	
	public static void main (String str[]){
		
		MyFrame mf = new MyFrame();
		Button b = new Button("OK");
		mf.addWindowListener (new WindowSensor());
		mf.setVisible(true);
		
	}
	
}