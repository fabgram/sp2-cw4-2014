/**
 * 
 */
package CW4;

/**
 * @author fabgraham
 *
 */
public class Ship {
	
	int bowRow;
	int bowColumn;
	int length;
	boolean horizontal;
	boolean [] hit;

	public int getBowRow() {
		return bowRow;
	}

	public void setBowRow(int bowRow) {
		this.bowRow = bowRow;
	}

	public int getBowColumn() {
		return bowColumn;
	}

	public void setBowColumn(int bowColumn) {
		this.bowColumn = bowColumn;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isHorizontal() {
		return horizontal;
	}

	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	public boolean[] getHit() {
		return hit;
	}

	public void setHit(boolean[] hit) {
		this.hit = hit;
	}

	String getShipType() {
		return "ship";
	}
	
	boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean){
		// TODO
	}
	
	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean){
		// TODO
	}
	
	boolean shootAt(int row, int column)  {
		// TODO
	}
	
	boolean isSunk(){
		// TODO
	}
	
}
