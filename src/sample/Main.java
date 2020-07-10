package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
       Scene scene = new Scene(root,720,406);
        primaryStage.setTitle("Biliskner");
        scene.setFill(Color.BLACK);

        Polyline YRDEN= new Polyline();
        YRDEN.setStroke(Color.rgb(165,52,209));
        YRDEN.setStrokeWidth(4);

        Circle YRDEN_circle = new Circle();
        YRDEN_circle.setCenterX(122);
        YRDEN_circle.setCenterY(199);
        YRDEN_circle.setRadius(50);
        YRDEN_circle.setFill(Color.rgb(165,52,209,0.15));
        root.getChildren().add(YRDEN_circle);


        YRDEN.getPoints().addAll(129.0,192.0,
                144.0,174.0,
                102.0,174.0,
                144.0,223.0,
                102.0,223.0,
                114.0,207.0);
        root.getChildren().add(YRDEN);




        Polyline QUEN = new Polyline();
        QUEN.setStrokeWidth(4);
        QUEN.setStroke(Color.rgb(251,255,77));
        QUEN.getPoints().addAll(245.0,190.0,
                262.0,190.0,
                271.0,174.0,
                217.0,174.0,
                244.0,223.0,
                253.0,207.0);
        root.getChildren().add(QUEN);

        Circle QUEN_circle = new Circle();
        QUEN_circle.setCenterX(243);
        QUEN_circle.setCenterY(198);
        QUEN_circle.setRadius(50);
        QUEN_circle.setFill(Color.rgb(251,255,77,0.15));
        root.getChildren().add(QUEN_circle);

        Polyline IGNI = new Polyline();
        IGNI.setStrokeWidth(4);
        IGNI.setStroke(Color.rgb(201,16,12));
        IGNI.getPoints().addAll(366.0,176.0,
                337.0,227.0,
                393.0,227.0,
                374.0,193.0);
        root.getChildren().add(IGNI);

        Circle IGNI_circle = new Circle();
        IGNI_circle.setCenterX(366);
        IGNI_circle.setCenterY(198);
        IGNI_circle.setRadius(50);
        IGNI_circle.setFill(Color.rgb(201,16,12,0.15));
        root.getChildren().add(IGNI_circle);

        Polyline AXII = new Polyline();
        AXII.setStrokeWidth(4);
        AXII.setStroke(Color.rgb(106,255,95));
        AXII.getPoints().addAll(514.0,174.0,
                459.0,174.0,
                486.0,223.0,
                505.0,191.0);
        root.getChildren().add(AXII);

        Circle AXII_circle = new Circle();
        AXII_circle.setCenterX(486);
        AXII_circle.setCenterY(198);
        AXII_circle.setRadius(50);
        AXII_circle.setFill(Color.rgb(106,255,95,0.15));
        root.getChildren().add(AXII_circle);

        Polyline AARD = new Polyline();
        AARD.setStrokeWidth(4);
        AARD.setStroke(Color.rgb(73,255,236));
        AARD.getPoints().addAll(597.0,189.0,
                607.0,174.0,
                636.0,223.0,
                579.0,223.0,
                591.0,205.0,
                607.0,205.0);
        root.getChildren().add(AARD);

        Circle AARD_circle = new Circle();
        AARD_circle.setCenterX(607);
        AARD_circle.setCenterY(198);
        AARD_circle.setRadius(50);
        AARD_circle.setFill(Color.rgb(73,255,236,0.15));
        root.getChildren().add(AARD_circle);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
