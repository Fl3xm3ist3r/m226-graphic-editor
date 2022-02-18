package main;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Draw {	
	/*public Draw() {
		if(ShapeReader.checkForFile("C:\\ProgramData\\shapes.txt")){
			ShapeReader shapeLoader = new ShapeReader();
			for(ShapeWithStyle s: shapeLoader.ReadShapes()) {
				shapes.add(s);
			}
		}	
	}*/
	private List<ShapeWithStyle> shapes = new ArrayList<ShapeWithStyle>();
	
	
	public void addShape(ShapeWithStyle shape) {
		this.shapes.add(shape);
		//ShapeSaver shapeSaver = new ShapeSaver(shape);		
	}
	
	public void drawShapes(Graphics2D g2d) {		
		for(Shape s: shapes) {
			s.draw(g2d);
		}
	}
}
