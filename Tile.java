
public class Tile
{
	//private int x;
	//private int y;
	private int r;	//rank
	
	public Tile(int rank) {
		r = rank;
	}
	
	public int rank () {
		return r;
	}
	
	public String toString (Tile theTile) {
		String str = "Tile number " + theTile.rank();
		return str;
	}
	
	public boolean isEmptyTile() {
		if (rank()==15)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
}
