package com.example.graphsplotting;

import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;

public class CartesianSystem implements CoordinateSystemStrategy {
    @Override
    public Chart displayGraph(String name, double[] xData, double[] yData) {
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("X-Axis");
        yAxis.setLabel("Y-Axis");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Cartesian Plot");

        XYChart.Series<Number, Number> series = new Series<>();
        series.setName(name);

        for (int i = 0; i < xData.length; i++) {
            series.getData().add(new XYChart.Data<>(xData[i], yData[i]));
        }

        lineChart.getData().add(series);
        return lineChart;
    }
}
