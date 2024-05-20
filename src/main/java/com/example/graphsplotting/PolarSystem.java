package com.example.graphsplotting;

import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;

public class PolarSystem implements CoordinateSystemStrategy {
    @Override
    public Chart displayGraph(String name, double[] rData, double[] thetaData) {
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("X-Axis");
        yAxis.setLabel("Y-Axis");

        ScatterChart<Number, Number> polarChart = new ScatterChart<>(xAxis, yAxis);
        polarChart.setTitle("Polar Plot");

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName(name);

        for (int i = 0; i < rData.length; i++) {
            double x = rData[i] * Math.cos(thetaData[i]);
            double y = rData[i] * Math.sin(thetaData[i]);
            series.getData().add(new XYChart.Data<>(x, y));
        }

        polarChart.getData().add(series);
        return polarChart;
    }
}
