package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class Circle extends ShapeWithStyle{
	public Circle(int x, int y, Color color, BasicStroke basicStroke, Color fillColor, ShapeStyle shapeStyle, int radius) {
		super(x, y, color, basicStroke, fillColor, shapeStyle);
		this.radius = radius;
	}
	
	private int radius;
	
	public void drawShape(Graphics2D g2d) {	
		g2d.setStroke(this.basicStroke);
		g2d.setColor(this.color);
		g2d.drawOval(super.x, super.y, this.radius, this.radius);
	}
	
	public void fillShape(Graphics2D g2d) {
		g2d.setColor(this.fillColor);
		g2d.fillOval(super.x, super.y, this.radius, this.radius);
	}
	
	public String getData() {
		return "Circle," + this.x + "," + this.y + "," + Integer.toHexString(this.color.hashCode()) + "," + this.basicStroke.getLineWidth() + "," + Integer.toHexString(this.fillColor.hashCode()) + "," + this.shapeStyle + "," + this.radius;
	}
}
