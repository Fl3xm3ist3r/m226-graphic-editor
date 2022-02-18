package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShapeReader {	
	private String filePath = "C:\\ProgramData\\shapes.txt";	
	
	public List<ShapeWithStyle> ReadShapes() {	
		List<ShapeWithStyle> shapes = new ArrayList<ShapeWithStyle>();
		
		
		try {
			File file = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(file));
 
			String st;

			while((st = br.readLine()) != null) {
				System.out.println(st);
				String[] parts = st.split(",");
				ShapeWithStyle shape = null;
				switch(parts[0]) {
					case "Line":																//convert string to basic stroke and colors
						shape = new Line(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Color.decode("#" + parts[3].substring(2)), new BasicStroke(Float.valueOf(parts[4])), Color.decode("#" + parts[5].substring(2)), stringToEnum(parts[6]), Integer.parseInt(parts[7]), Integer.parseInt(parts[8]));
						break;
					case "Circle":
						shape = new Circle(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Color.decode("#" + parts[3].substring(2)), new BasicStroke(Float.valueOf(parts[4])), Color.decode("#" + parts[5].substring(2)), stringToEnum(parts[6]), Integer.parseInt(parts[7]));
						break;
					case "Rectangle":
						shape = new Rectangle(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Color.decode("#" + parts[3].substring(2)), new BasicStroke(Float.valueOf(parts[4])), Color.decode("#" + parts[5].substring(2)), stringToEnum(parts[6]), Integer.parseInt(parts[7]), Integer.parseInt(parts[8]));
						break;
				}
				
				shapes.add(shape);
			}				
		}
		catch (IOException e) {
		    e.printStackTrace();
		}		
		return shapes;
	}
	
	public static boolean checkForFile(String filePath) {
        if(new File(filePath).exists()) {
            return true;
        }
        return false;
    }
	
	public static Color hex2Rgb(String colorStr) {
	    return new Color(
	            Integer.valueOf( colorStr.substring( 1, 3 ), 16 ),
	            Integer.valueOf( colorStr.substring( 3, 5 ), 16 ),
	            Integer.valueOf( colorStr.substring( 5, 7 ), 16 ) );
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
