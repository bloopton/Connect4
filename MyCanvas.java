import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MyCanvas extends Canvas  
{
	    public MyCanvas()  {
	    }
	    int row=7;
	    int column=7;
	    int board[][]=new int[row][column];
	    
	    public void paint (Graphics graphics){
	        graphics.setColor(Color.black);
	        graphics.drawRect(10,10,50,50);
	    }
}