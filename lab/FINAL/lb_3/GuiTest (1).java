import java.awt.*;
import java.awt.event.*;
class WindowSensor extends WindowAdapter{
	public void windowClosing(WindowEvent we){
	System.out.println("Window is closing");
		System.exit(0);
	}
}
class ButtonSensor implements ActionListener{
	static int c;
	public void actionPerformed(ActionEvent ae)
	{
		c++;
		System.out.println("Button was pressed"+c);
	}
}
class MouseSensor extends MouseAdapter{
	public void mouseDragged(MouseEvent me){
		System.out.println("Mouse Dragged"+"x: "+me.getX() +"\ty:"+me.getY());
	}
	public void mousePressed(MouseEvent me){
		System.out.println("Mouse Pressed");
	}
	public void mouseMoved(MouseEvent me){
		System.out.println("Mouse Moved");
	}
}
class MyFrame extends Frame{
	public MyFrame(){
		super("Java First Window");
		Button b=new Button("OK");
		setSize(400,400);
			add(b);
		b.addActionListener(new ButtonSensor());
		this.addMouseListener(new MouseSensor());
		this.addMouseMotionListener(new MouseSensor());
		setLayout(new FlowLayout());
	}
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawString("Bangladesh National Flag",120,250);
		g.setColor(new Color(10,120,0));
		g.fillRect(100,120,200,100);
		//g.drawOval(170,150,50,50);
		g.setColor(Color.red);
		g.fillOval(170,150,50,50);
		g.setColor(Color.black);
		g.fillRect(90,120,10,300);
		//g.drawLine(100,100,300,300);
		
		//g.setColor(Color.blue);
		
		
		
	}
}
class GuiTest{
	public static void main(String str[]){
		MyFrame mf=new MyFrame();
		mf.addWindowListener(new WindowSensor());
		mf.setVisible(true);
	}
}

