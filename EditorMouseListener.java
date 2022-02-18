package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditorMouseListener extends MouseAdapter{
	public EditorMouseListener(EditorControl editorControl) {
		this.editorControl = editorControl;
	}
	
	private EditorControl editorControl;
	
	@Override
	public void mousePressed(MouseEvent event) {
		System.out.println("preddes: " + event.getPoint());
		editorControl.setFirstPoint(event.getPoint());
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {
		System.out.println("clicked: " + event.getPoint());
		editorControl.setFirstPoint(event.getPoint());
	}
	
	@Override
	public void mouseReleased(MouseEvent event) {
		//System.out.println(event.getPoint());
		editorControl.createShapeWithSeconPoint(event.getPoint());
	}
}
