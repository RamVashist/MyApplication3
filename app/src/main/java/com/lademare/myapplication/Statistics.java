package com.lademare.myapplication;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Statistics {
    GraphView graph = (GraphView) findViewById(R.id.graph);

    private Object findViewById(int graph) {
    }

    LineGraphSeries<DataPoint> series;

    public Statistics() {
        series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 5),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 1),
                new DataPoint(4, 6)
        });
    }
}
