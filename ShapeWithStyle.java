package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public abstract class ShapeWithStyle extends Shape{
	public ShapeWithStyle(int x, int y, Color color, BasicStroke basicStroke, Color fillColor, ShapeStyle shapeStyle) {
		super(x, y, color, basicStroke);
		this.fillColor = fillColor;
		this.shapeStyle = shapeStyle;
	}
	
	protected Color fillColor;
	protected ShapeStyle shapeStyle;
	
	public void draw(Graphics2D g2d) {
		switch (this.shapeStyle) {
	    	case FILL:
	    		this.fillShape(g2d);    		
	    		break;
		    case BORDER:
		    	this.drawShape(g2d);
		        break;
		    case BOTH:
		    	this.fillShape(g2d);
		    	this.drawShape(g2d);
		    	break;
		}
	}
	
	public abstract void drawShape(Graphics2D g2d);
	
	public abstract void fillShape(Graphics2D g2d);
	
	public abstract String getData();
}
