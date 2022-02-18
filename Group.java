package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Group extends ShapeWithStyle{
	public Group(int x, int y, Color color, BasicStroke basicStroke, Color fillColor, ShapeStyle shapeStyle) {
		super(x, y, color, basicStroke, fillColor, shapeStyle);
	}
	
	private List<ShapeWithStyle> shapes = new ArrayList<ShapeWithStyle>();

	public void addToGroup(ShapeWithStyle shape) {
		shapes.add(shape);
	}
	
	public void removeFromGroup(ShapeWithStyle shape) {
		shapes.remove(shape);
	}
	
	public void draw(Graphics2D g2d) {
		for(Shape s: shapes) {
			s.draw(g2d);
		}
	}
	
	public void drawShape(Graphics2D g2d) {
		g2d.setStroke(basicStroke);
		g2d.setColor(color);
		for(Shape s: shapes) {
			((ShapeWithStyle)s).drawShape(g2d);
		}
	}
	
	public void fillShape(Graphics2D g2d) {
		g2d.setColor(fillColor);
		for(ShapeWithStyle s: shapes) {
			s.fillShape(g2d);
		}	
	}
	
	public String getData() {
		return null;
	}
}
