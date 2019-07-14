import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class WindowSensor extends WindowAdapter{
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
}
class MyFrame extends Frame{
    private String msg;
    public Button moveButton;
    public Button goButton;
    public int x,y,x2,x1,x3,x4;
	
    public MyFrame(){
        super("Java First Window");
        x=100;
	y=20;
	x2=120;
	x1=200;
	x3 = 10;
	x4 = 50;
        moveButton=new Button("Move");
        goButton=new Button("Go");
        
        msg="Frame is created";
        add(moveButton);
        add(goButton);
        moveButton.addActionListener(new ButtonSensor(this));
        goButton.addActionListener(new ButtonSensor(this));
        setSize(600,400);
	    setLayout(new FlowLayout());
    }
    public void setMessage(String s){
        msg=s;
    }
	public void paint(Graphics g){
        if(x>this.getWidth())x=0;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        
		g.drawLine(100,100,200,200);
		g.setColor(Color.RED);
		g.drawRect(x,x2,x1,120);
		g.setColor(new Color(0,0,255));
		g.drawString(msg,20,40);
	
     //   g.setColor(Color.BLACK);
       // 
        if(y>this.getHeight())y=0;
	//g.fillRect(0, 0, getWidth(), getHeight());
        
		//g.drawLine(50,50,80,80);
		g.setColor(Color.GREEN);
		g.drawRect(x3,y,x4,120);
		//g.setColor(new Color(0,0,200));
		//g.drawString(msg,40,20);
        //g.setColor(Color.WHITE);
        //g.fillRect(0, 0, getWidth(), getHeight());
	 }
    public void update(Graphics g) {
      paint(g);
    }
}
class ButtonSensor implements ActionListener,Runnable{
	MyFrame fm;
    Thread buttonThread = null;
	public ButtonSensor(MyFrame f){
		fm=f;
        buttonThread = new Thread(this);
         //buttonThread.start();
	}
	public void actionPerformed(ActionEvent ae){
        if((Button)ae.getSource()==fm.moveButton){
            fm.setMessage("Moved");
            //fm.setMessage(String.valueOf(fm.getWidth()));
            fm.x+=4;
	    fm.repaint();
            fm.y+=2;
	    fm.repaint();
		}
        else if((Button)ae.getSource()==fm.goButton){
            fm.setMessage("Go");
            buttonThread.start();
        }
	}

    public void run(){
                while(true){
                    try{
                        Thread.sleep(100);
                        fm.x+=10;
			fm.y+=10;
                        //System.out.println("moving at x : "+fm.x+", i: "+i);
                        //Thread.sleep(300);
                        fm.repaint();
			if ( fm.y >= fm.x && fm.y <= fm.x1){
				if (fm.x1 >= fm.x4 )
					fm.setMessage("Intersected");
					fm.setMessage(String.valueOf(fm.x));
					System.out.println("paint at x : "+fm.x);
					System.out.println("paint at y : "+fm.y);
					fm.setMessage(String.valueOf(fm.y));
					//Thread.sleep(100);
				}
                    }catch(InterruptedException ex){ex.printStackTrace();
                }
    }
}
}

public class RectMove{
    public static void main(String str[]){
        MyFrame mf=new MyFrame();
        mf.addWindowListener(new WindowSensor());
        mf.setVisible(true);
    }
}