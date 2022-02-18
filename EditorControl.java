package main;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.BasicStroke;
import java.awt.Color;

final class EditorControl {
	public EditorControl(EditorFrame frame) {
		this.frame = frame;
	}
	
	private EditorFrame frame;
	private Shapes shapeType = Shapes.LINE;
	private Draw draw = new Draw();
	private Point firstPoint;
	private Group testgroup = new Group(0,0, Color.black, new BasicStroke(5), Color.white, ShapeStyle.BORDER);

	public void reDraw(Graphics2D g2d) {
		draw.drawShapes(g2d);
	}

	public void setShapeType(Shapes shapeType) {
		this.shapeType = shapeType;
	}

	public void setFirstPoint(Point firstPoint) {
		this.firstPoint = firstPoint;
	}
  
	public void addShape(ShapeWithStyle shape) {
		draw.addShape(shape);
	}

	public void createShapeWithSeconPoint(Point secondPoint) {
		ShapeWithStyle shape = null;
		switch(shapeType) {
			case CIRCLE:
				int distance = (int)Math.round(Math.sqrt(Math.pow((secondPoint.x - firstPoint.x), 2) + Math.pow((secondPoint.y - firstPoint.y), 2)) * 2);
				shape = new Circle(this.firstPoint.x - (distance /2), this.firstPoint.y - (distance /2), Color.black, new BasicStroke(5), Color.white, ShapeStyle.BOTH, distance);
				break;
			case RECTANGLE:
				shape = new Rectangle(Math.min(this.firstPoint.x, secondPoint.x) , Math.min(this.firstPoint.y, secondPoint.y), Color.black, new BasicStroke(5), Color.white, ShapeStyle.BOTH, Math.abs(secondPoint.x - firstPoint.x), Math.abs(secondPoint.y - firstPoint.y));
				break;
			case LINE:
				shape = new Line(firstPoint.x, firstPoint.y, Color.black, new BasicStroke(5), Color.white, ShapeStyle.BOTH, secondPoint.x, secondPoint.y);
				break;
			case TEXT:
				break;
		}
		testgroup.addToGroup(shape);
		draw.addShape(shape);
		frame.repaint();
	}
}
