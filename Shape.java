package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public abstract class Shape extends Movable{
	public Shape(int x, int y, Color color, BasicStroke basicStroke) {
		super(x, y);
		this.color = color;	
		this.basicStroke = basicStroke;
	}
	
	protected Color color;
	protected BasicStroke basicStroke;
	
	public abstract void draw(Graphics2D g2d);
}
