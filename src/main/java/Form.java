import javafx.scene.shape.Rectangle;

public class Form {
    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;

    private String name;
    public int form = 1;

    public Form (Rectangle a, Rectangle b, Rectangle c, Rectangle d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Form (Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;
    }

    //Set color of the stones
}
