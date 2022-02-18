package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class FigurParser {
  private final IFigurFileDAO dao;

  public FigurParser(IFigurFileDAO dao) {
    this.dao = dao;
  }

  public List<ShapeWithStyle> parse() {
    List<ShapeWithStyle> figuren = new ArrayList<ShapeWithStyle>();
    String[] parts = dao.readNextFigurData();
    while (parts != null) {
      switch(parts[0]) {
		case "Line":
			figuren.add(new Line(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Color.decode("#" + parts[3].substring(2)), new BasicStroke(Float.valueOf(parts[4])), Color.decode("#" + parts[5].substring(2)), stringToEnum(parts[6]), Integer.parseInt(parts[7]), Integer.parseInt(parts[8])));
			break;
		case "Circle":
			figuren.add(new Circle(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Color.decode("#" + parts[3].substring(2)), new BasicStroke(Float.valueOf(parts[4])), Color.decode("#" + parts[5].substring(2)), stringToEnum(parts[6]), Integer.parseInt(parts[7])));
			break;
		case "Rectangle":
			figuren.add(new Rectangle(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Color.decode("#" + parts[3].substring(2)), new BasicStroke(Float.valueOf(parts[4])), Color.decode("#" + parts[5].substring(2)), stringToEnum(parts[6]), Integer.parseInt(parts[7]), Integer.parseInt(parts[8])));
			break;
	}
      parts = dao.readNextFigurData();
    }
    return figuren;
  }
  
  public static ShapeStyle stringToEnum(String string) {
	    switch(string) {
	    case "BORDER":
	    default:
	    	return ShapeStyle.BORDER;
	    case "FILL":
	    	return ShapeStyle.FILL;
	    case "BOTH":
	    	return ShapeStyle.BOTH;
	    }
	}
}
