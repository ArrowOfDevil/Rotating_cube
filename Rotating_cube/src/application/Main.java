package application;
	
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Box box = new Box();
		box.setWidth(300); 
		box.setHeight(300); 
		box.setDepth(300); 
		
		
		box.setTranslateX(350);
		box.setTranslateY(300);
		box.setTranslateZ(50);

		PhongMaterial mt = new PhongMaterial();
		mt.setDiffuseColor(Color.DARKRED);
	    mt.setSpecularColor(Color.WHITE);
		box.setMaterial(mt);
		RotateTransition rt = new RotateTransition();
		rt.setDuration(Duration.millis(10000));
		rt.setAxis(Rotate.Y_AXIS);
		rt.setByAngle(360);
		rt.setCycleCount(2000000000);
		rt.setNode(box);
		
		
		
		
		
		
		Button btn = new Button();
		btn.setText("Start");
		btn.setLayoutX(100);
		btn.setLayoutY(200);
		Button bt = new Button();
		bt.setText("Stop");
		bt.setLayoutX(100);
		bt.setLayoutY(250);
		EventHandler<javafx.scene.input.MouseEvent> evh1 = 
				new EventHandler<javafx.scene.input.MouseEvent>() { 
				@Override 
				public void handle(MouseEvent e) { 
				rt.pause();
				} 
				}; 
		
		
		EventHandler<javafx.scene.input.MouseEvent> evh = 
				new EventHandler<javafx.scene.input.MouseEvent>() { 
				@Override 
				public void handle(MouseEvent e) { 
				rt.play(); 
				} 
				}; 
				
				btn.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, evh); 
				bt.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, evh1);
				Group root = new Group(box,btn, bt); 
				Scene scene = new Scene(root,1000,800); 

				PerspectiveCamera camera = new PerspectiveCamera(); 
				camera.setTranslateX(0); 
				camera.setTranslateY(0); 
				camera.setTranslateZ(50); 
				scene.setCamera(camera); 

				primaryStage.setScene(scene); 
				primaryStage.show(); 	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
