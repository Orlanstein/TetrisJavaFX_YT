import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Tetris extends Application {
    public static final int MOVE = 25;
    public static final int SIZE = 25;
    public static int XMAX = SIZE * 12; //Weigth max of the game area
    public static int YMAX = SIZE * 24; //Hight max of the game area
    public static int [][]MESH = new int[XMAX/SIZE][YMAX/SIZE];

    private static Pane groupe = new Pane();
    private static Form object;
    private static Scene scene = new Scene(groupe, XMAX + 150, YMAX); //Area of information

    public static int score = 0;

    private static boolean game = true;
    private static Form nextObj = Controller.makeRect();
    private static int linesNo = 0;

    @Override
    public void start(Stage stage) throws Exception {

    }
}
