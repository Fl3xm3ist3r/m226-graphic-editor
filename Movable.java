package main;

public class Movable{   
	public Movable(int x, int y) {
		this.x = x;
		this.y = y;
	}

	protected int x;
	protected int y;
	
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
