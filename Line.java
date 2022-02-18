package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class Line extends ShapeWithStyle{
	public Line(int x, int y, Color color, BasicStroke basicStroke, Color fillColor, ShapeStyle shapeStyle, int endX, int endY) {
		super(x, y, color, basicStroke, fillColor, shapeStyle);
		this.endX = endX;
		this.endY = endY;
	}
	
	private int endX;
	private int endY;
	
	public void drawShape(Graphics2D g2d) {
		g2d.setStroke(this.basicStroke);
		g2d.setColor(this.color);
        g2d.drawLine(super.x, super.y, this.endX, this.endY);
	}
	
	public void fillShape(Graphics2D g2d) {
		g2d.setStroke(this.basicStroke);
		g2d.setColor(this.fillColor);
        g2d.drawLine(super.x, super.y, this.endX, this.endY);
	}
	
	public String getData() {
		return "Line," + this.x + "," + this.y + "," + Integer.toHexString(this.color.hashCode()) + "," + this.basicStroke.getLineWidth() + "," + Integer.toHexString(this.fillColor.getRGB()) + "," + this.shapeStyle.toString() + "," + this.endX + "," + this.endY;
	}
}
