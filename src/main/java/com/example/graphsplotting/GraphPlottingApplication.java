package com.example.graphsplotting;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GraphPlottingApplication extends Application {
    @Override
    public void start(Stage primaryStage) {

        // y = 2x - 1

        MathFunction mathFunction1 = new MathFunction("Slope Function", new CartesianSystem());
        double[] xData = new double[10];
        double[] yData = new double[10];
        double step = 1;
        xData[0] = 0;
        for (int i=0; i<xData.length; i++) {
            yData[i] = 2 * xData[i] - 1;
            if (i != xData.length - 1) {
                xData[i + 1] = xData[i] + step;
            }
        }

        MathFunction mathFunction2 = new MathFunction("Archimedes Spiral", new PolarSystem());
        double[] RData = new double[10];
        double[] thetaData = new double[10];
        thetaData[0] = 0;
        step = Math.PI/6;
        for (int i=0; i<thetaData.length; i++) {
            RData[i] = thetaData[i];
            if (i != thetaData.length - 1) {
                thetaData[i + 1] = thetaData[i] + step;
            }
        }


        HBox root = new HBox();
        root.getChildren().add(mathFunction1.displayGraph(xData, yData));
        root.getChildren().add(mathFunction2.displayGraph(RData, thetaData));

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Graph Plotting");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}