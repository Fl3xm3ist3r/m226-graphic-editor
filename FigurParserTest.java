package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigurParserTest {
	private IFigurFileDAO dao;
    private FigurParser parser;

    @BeforeEach
    public void setup() {
        dao = new FigurFileDAOStub();
        parser = new FigurParser(dao);
    }

    @Test
    public void testShapeParser() {
        List<ShapeWithStyle> shapes = parser.parse();
        assertEquals(3, shapes.size());
        System.out.print("DDD "+  shapes.get(0).toString() + "DDD ");
        assertEquals("Line,145,148,ff000000,5.0,ffffffff,BOTH,263,264", shapes.get(0).getData());
        
        assertEquals("Circle,186,247,ff000000,5.0,ffffffff,BOTH,196", shapes.get(1).getData());
        assertEquals("Rectangle,217,275,ff000000,5.0,ffffffff,BOTH,128,145", shapes.get(2).getData()); 
    }
}
