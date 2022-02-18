package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ShapeSaver {
	public ShapeSaver(ShapeWithStyle shape) {
		 createFile(shape);
	}
	
	private String filePath = "C:\\ProgramData\\shapes.txt";	
	
	public void createFile(ShapeWithStyle shape) {
		FileWriter writer;		
		File file = new File(filePath);
		
		try {		  
			writer = new FileWriter(file, true);
			writer.write(shape.getData());
			if(shape.getData() != null)
				writer.write(System.getProperty("line.separator"));
			
			writer.flush();
			writer.close();
			  			
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
