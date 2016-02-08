import java.util.*;
import java.awt.*;


public class Main {
	
	public static void main (String args[]) {
		TilePanel thePanel = new TilePanel();
		
		thePanel.shuffle();
		for (int i = 0; i < 16; i++)
		{
			System.out.println(Integer.toString(thePanel.findPositionByRank(i)));
		}
		
	}
}

