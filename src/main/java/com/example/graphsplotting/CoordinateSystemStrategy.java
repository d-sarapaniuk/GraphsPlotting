package com.example.graphsplotting;

import javafx.scene.chart.Chart;
public interface CoordinateSystemStrategy {
    Chart displayGraph(String name, double[] xData, double[] yData);
}
