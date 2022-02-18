package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;


public class DrawTest {
	private Graphics2D g = mock(Graphics2D.class);
	
	@Test
	public void testDrawShapes() {
		Draw draw = new Draw();
		
		draw.addShape(new Circle(10, 30, Color.black, new BasicStroke(5), Color.white, ShapeStyle.BORDER, 20));
		
		draw.drawShapes(g);
		verify(g, times(1)).drawOval(10, 30, 20, 20);
	}
}
