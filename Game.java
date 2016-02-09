import java.awt.*;
import java.awt.event.*;

public class Game 
{ 
	//private
	private TilePanel gamePanel;
  // constructors
    public Game (int x, int y, int rank) 
    {
		gamePanel = new TilePanel(x,y,rank); 
    }
    public Game (int x, int y)
    {	this(4, x, y); }
    
    public static void paint (TileView tv) {
		gamePanel.display(tv);
	} 
	
	public static void mouseDown (int x, int y) {
		System.out.println(x + " " + y);
		
		}
	}
}
