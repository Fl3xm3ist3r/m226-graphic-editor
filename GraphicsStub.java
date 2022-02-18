package main;

public class GraphicsStub extends ConcretGraphics{
	int numbOfDrawCircle = 0;
	int x = 0;
	int y = 0;
	int width = 0;
	int height = 0;
	
	@Override
	public void drawOval(int x, int y, int width, int height) {
		numbOfDrawCircle++;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}
