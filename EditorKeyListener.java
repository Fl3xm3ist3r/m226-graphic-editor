package main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EditorKeyListener extends KeyAdapter{
	public EditorKeyListener(EditorControl editorControl) {
		this.editorControl = editorControl;
	}
	
	private EditorControl editorControl;
	
	@Override
	public void keyPressed(KeyEvent event) {
		System.out.println(event.getKeyCode());
		switch((char)event.getKeyCode()) {
			case 'C':
				editorControl.setShapeType(Shapes.CIRCLE);
				break;
			case 'R':
				editorControl.setShapeType(Shapes.RECTANGLE);
				break;
			case 'L':
				editorControl.setShapeType(Shapes.LINE);
				break;		
			case 'F':
				editorControl.setShapeType(Shapes.LINE);
				break;	
		}		
	}
}