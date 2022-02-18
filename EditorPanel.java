package main;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel {
  EditorPanel(EditorControl editorControl) {
    this.editorControl = editorControl;
    addMouseListener(new EditorMouseListener(editorControl));
  }
  
  private EditorControl editorControl;

  // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
  // Methode beim EditorFrame oder beim EditorPanel aufruft.
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    editorControl.reDraw((Graphics2D)g);
  }
}