import javafx.css.Size;
import javafx.scene.shape.*;
public class Controller {
    //getting numbers and mesh froms tetris class
    public static final int MOVE = Tetris.MOVE;
    public static final int SIZE = Tetris.SIZE;
    public static int XMAX = Tetris.XMAX;
    public static int YMAX = Tetris.YMAX;
    public static int [][] MESH = Tetris.MESH;

    //moving the blocks
    public static void MoveRight (Form form){
        int RightValue = XMAX - SIZE;
        if( form.a.getX() + MOVE <= RightValue && form.b.getX() + MOVE <= RightValue
            && form.c.getX() + MOVE <= RightValue && form.d.getX() + MOVE <= XMAX-SIZE){

            int movea = MESH[((int) form.a.getX() / SIZE) + 1][((int) form.a.getY() / SIZE)];
            int moveb = MESH[((int) form.b.getX() / SIZE) + 1][((int) form.b.getY() / SIZE)];
            int movec = MESH[((int) form.c.getX() / SIZE) + 1][((int) form.c.getY() / SIZE)];
            int moved = MESH[((int) form.d.getX() / SIZE) + 1][((int) form.d.getY() / SIZE)];

            if(movea == 0 && movea == moveb && moveb == movec && movec == moved){
                form.a.setX(form.a.getX() + MOVE);
                form.b.setX(form.b.getX() + MOVE);
                form.c.setX(form.c.getX() + MOVE);
                form.d.setX(form.d.getX() + MOVE);
            }
        }
    }
    public static void MoveLeft (Form form){
        if( form.a.getX() + MOVE >= 0 && form.b.getX() + MOVE >= 0
                && form.c.getX() + MOVE >= 0 && form.d.getX() + MOVE >= 0){

            int movea = MESH[((int) form.a.getX() / SIZE) - 1][((int) form.a.getY() / SIZE)];
            int moveb = MESH[((int) form.b.getX() / SIZE) - 1][((int) form.b.getY() / SIZE)];
            int movec = MESH[((int) form.c.getX() / SIZE) - 1][((int) form.c.getY() / SIZE)];
            int moved = MESH[((int) form.d.getX() / SIZE) - 1][((int) form.d.getY() / SIZE)];

            if(movea == 0 && movea == moveb && moveb == movec && movec == moved){
                form.a.setX(form.a.getX() - MOVE);
                form.b.setX(form.b.getX() - MOVE);
                form.c.setX(form.c.getX() - MOVE);
                form.d.setX(form.d.getX() - MOVE);
            }
        }
    }

    public static Form makeRect(){
        //Random Color for the stones
        int block = (int) (Math.random() * 100);
        String name;

        //Esto dibuja las aristas de cada cuadro de cada tetriminio
        Rectangle
                a = new Rectangle(SIZE-1, SIZE-1),
                b = new Rectangle(SIZE-1, SIZE-1),
                c = new Rectangle(SIZE-1, SIZE-1),
                d = new Rectangle(SIZE-1, SIZE-1);

        if(block <15){
            a.setX(XMAX/2 - SIZE);
            b.setX(XMAX/2 - SIZE);
            b.setY(SIZE);
            c.setX(XMAX/2);
            c.setY(SIZE);
            d.setX(XMAX/2 + SIZE);
            d.setY(SIZE);
            name = "j";
        }
        if(block <30){
            a.setX(XMAX/2 + SIZE);
            b.setX(XMAX/2 - SIZE);
            b.setY(SIZE);
            c.setX(XMAX/2);
            c.setY(SIZE);
            d.setX(XMAX/2 + SIZE);
            d.setY(SIZE);
            name = "l";
        }
        if(block <45){
            a.setX(XMAX/2 - SIZE);
            b.setX(XMAX/2);
            b.setX(XMAX/2 - SIZE);
            c.setY(SIZE);
            d.setX(XMAX / 2);
            d.setY(SIZE);
            name = "o";
        }
        if(block <60){
            a.setX(XMAX/2 + SIZE);
            b.setX(XMAX/2);
            b.setX(XMAX/2);
            c.setY(SIZE);
            d.setX(XMAX/2 - SIZE);
            d.setY(SIZE);
            name = "s";
        }
        if(block <75){
            a.setX(XMAX/2 - SIZE);
            b.setX(XMAX/2);
            b.setX(XMAX/2);
            c.setY(SIZE);
            d.setX(XMAX / 2 + SIZE);
            name = "t";
        }
        if(block < 90){
            a.setX(XMAX/2 + SIZE);
            b.setX(XMAX / 2);
            b.setX(XMAX/2 + SIZE);
            c.setY(SIZE);
            d.setX(XMAX/2 + SIZE + SIZE);
            d.setY(SIZE);
            name = "z";
        }
        else{
            a.setX(XMAX/2 - SIZE -SIZE);
            b.setX(XMAX/2 -SIZE);
            b.setX(XMAX / 2);
            d.setX((XMAX/2 + SIZE));
            name = "i";
        }
        return new Form(a,b,c,d,name);
    }
}
