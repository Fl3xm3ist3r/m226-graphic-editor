package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.BasicStroke;
import java.awt.Color;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {
	private GraphicsStub g = new GraphicsStub();
	
	@Test
	public void testDraw() {
		Circle c = new Circle(10, 30, Color.black, new BasicStroke(5), Color.white, ShapeStyle.BORDER, 20);
		c.draw(g);
		assertEquals(1, g.numbOfDrawCircle);
		assertEquals(10, g.x);
		assertEquals(30, g.y);
		assertEquals(20, g.height);
		assertEquals(20, g.width);
	}
}
