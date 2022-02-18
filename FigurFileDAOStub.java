package main;

public class FigurFileDAOStub implements IFigurFileDAO{
	private String[] figures = {
            "Line,145,148,ff000000,5.0,ffffffff,BOTH,263,264",
            "Circle,186,247,ff000000,5.0,ffffffff,BOTH,196",
            "Rectangle,217,275,ff000000,5.0,ffffffff,BOTH,128,145"
    };
	
    private int index = 0;
    
    @Override
    public String[] readNextFigurData() {
        if (index < figures.length) {
            String[] line = figures[index].split(",");
            index++;
            return line;
        } else {
            return null;
        }
    }
}
