package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class Rectangle extends ShapeWithStyle{
	public Rectangle(int x, int y, Color color, BasicStroke basicStroke, Color backgroundColor, ShapeStyle shapeStyle, int width, int height) {
		super(x, y, color, basicStroke, backgroundColor, shapeStyle);
		this.width = width;
		this.height = height;	
	}
	
	private int width;
	private int height;
		
	public void drawShape(Graphics2D g2d) {
		g2d.setStroke(this.basicStroke);
		g2d.setColor(this.color);
        g2d.drawRect(super.x, super.y, this.width, this.height);
	}
	
	public void fillShape(Graphics2D g2d) {
		g2d.setColor(this.fillColor);
        g2d.fillRect(super.x, super.y, this.width, this.height);
	}
	
	public String getData() {
		return "Rectangle," + this.x + "," + this.y + "," + Integer.toHexString(this.color.hashCode()) + "," + this.basicStroke.getLineWidth() + "," + Integer.toHexString(this.fillColor.hashCode()) + "," + this.shapeStyle + "," + this.width + "," + this.height;
	}
}
