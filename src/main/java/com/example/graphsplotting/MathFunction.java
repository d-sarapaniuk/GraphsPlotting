package com.example.graphsplotting;

import javafx.scene.chart.Chart;


public class MathFunction {
    private CoordinateSystemStrategy strategy;
    private String name;
    //private Function<Double, Double> function;
    public MathFunction(String name, CoordinateSystemStrategy strategy) {
        this.strategy = strategy;
        this.name = name;
    }

    public void setDisplayStrategy(CoordinateSystemStrategy strategy) {
        this.strategy = strategy;
    }
    public CoordinateSystemStrategy getStrategy() {
        return strategy;
    }

    public Chart displayGraph(double[] firstData, double[] secondData) {
        if (strategy == null) {
            throw new IllegalStateException("Display strategy not set");
        }
        return strategy.displayGraph(name, firstData, secondData);

    }
}

