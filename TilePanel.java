import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class TilePanel {
	
	//ArrayList of Tiles
	private ArrayList<Tile> tileList;
	//number of tiles
	private int nTiles;
	//list of borders
	private final List<Integer> borderPos = new ArrayList<Integer>() {{
		add(0);
		add(4);
		add(8);
		add(12);
		add(3);
		add(7);
		add(11);
		add(15);
	}}; 
	
	//constructor
	public TilePanel(int numberOfTiles) {
		nTiles = numberOfTiles; 	//default value = 15
		tileList = new ArrayList<Tile>();
		for (int i = 0; i < nTiles; i++)
		{
			tileList.add(new Tile(i));
		}
	}
	//default constructor
	public TilePanel () {
		this(16);
	}
	
	//find position by rank - returns index in the list
	public int findPositionByRank(int rank) {
		for (int i = 0; i < tileList.size(); i++)
		{
			if( tileList.get(i).rank() == rank ) { return i; }
		}
		return -1;
	}
	
	//find rank by position
	public int findRankByPosition(int position)
	{
		return position >= 0 && position < tileList.size() ? 
										tileList.get(position).rank() :
										-1;
	}
	
	//find empty panel position - rank 16 by default, 
	//initially at the end ofthe list
	public int findEmptyTile() {
		for (int i = 0; i < tileList.size(); i++)
		{
			if( tileList.get(i).rank() == tileList.size() ) return i;
		}
		return -1;
		
	}
		
	//shuffle method
	public void shuffle()
	{
		Collections.shuffle(tileList);
	}
	
	public bool puzzleCompleted(){
		for (int i = 0; i < tileList.size(); i++)
		{
			if (tileList.get(i).rank() != i) 
			{	return false;	}
			return true;
			
		}
	}
	
	//check if numbers are across the border
	public bool checkBorder(int a, int b) {
		return borderPos.contains(a) && borderPos.contains(b);
	}
	
	//tile can be moved if -1, 1, -4, 4 is empty
	//and it's not at the border.
	public bool canMoveTile( Tile aTile) {
		switch abs(findPositionByRank(aTile.rank())-findEmptyTile())
		{
			case 1:
				if (!checkBorder(findPositionByRank(aTile.rank()), 
					findEmptyTile())) {	return true; }
				else { return false;	}
				break;
			case 4:
				return true;
				break;
			default:
			return false;
				
		}
		
	}
}
