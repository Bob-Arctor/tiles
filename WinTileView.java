import java.awt.*;

public class WinTileView extends TileView {
	
	public WinTileView (Graphics aGraphicsObject) {
		g = aGraphicsObject;
	}
	
	public void display (Tile aTile, int x, int y)
	{
		if(aTile.isEmptyTile()) {
			g.clearRect(x, y, tileWidth, tileWidth);
			//g.setColor(Color.black);
			//g.fillRect(x, y, width, height);
		} else {
			paintTile(aTile, x , y);
		}
	}
	
	private void paintTile (Tile aTile, int x, int y) 
	{
		// clear rectangle, draw border
		g.clearRect(x, y, tileWidth, tileWidth);
		g.setColor(Color.black);
		g.drawRect(x, y, tileWidth, tileWidth);
		//g.setColor("#7F7F7F");
		g.fillRect(x, y, tileWidth, tileWidth);
           
		g.setColor(Color.white);
		g.drawString(Integer.toString(aTile.rank()), 
					x + tileWidth/2,
					y + tileWidth/2);
	}
	
	private Graphics g;
	
	
} 
