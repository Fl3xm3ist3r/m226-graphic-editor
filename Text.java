package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Text extends ShapeWithStyle{
	public Text(int x, int y, Color color, BasicStroke basicStroke, Color fillColor, ShapeStyle shapeStyle,String text, Font fontStyle) {
		super(x, y, color, basicStroke, fillColor, shapeStyle);
		this.text = text;
		this.fontStyle = fontStyle;
	}
	
	private String text;
	private Font fontStyle;
	
	public void drawShape(Graphics2D g2d) {
		g2d.setStroke(this.basicStroke);
		g2d.setColor(this.color);
		g2d.setFont(this.fontStyle);
		g2d.drawString(this.text, super.x, super.y);
	}
	
	public void fillShape(Graphics2D g2d) {
		
	}
	
	public String getData() {
		return "Text," + this.x + "," + this.y + "," + this.color + "," + this.basicStroke + "," + this.fillColor + "," + this.shapeStyle + "," + this.text + "," + this.fontStyle;
	}
}
