package designPatternCreational.adapter;

/**
 * Created by RENT on 2017-03-27.
 */
public class ShapeAdapter implements Shape {

    Rectangle rectangle;
    Line line;

    public ShapeAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public ShapeAdapter(Line line) {
        this.line = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        if(rectangle!=null){
            rectangle.draw(x1,y1,x2,y1,x2,y2,x1,y2);
        }else if(line !=null){
            line.draw(x1,y1,x2,y2);
        }

    }
}
