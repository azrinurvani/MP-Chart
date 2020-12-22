package com.mobile.azrinurvani.mpchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> visitors = new ArrayList<>();

        visitors.add(new PieEntry(508,"2014"));
        visitors.add(new PieEntry(608,"2015"));
        visitors.add(new PieEntry(708,"2016"));
        visitors.add(new PieEntry(408,"2017"));
        visitors.add(new PieEntry(908,"2018"));
        visitors.add(new PieEntry(1008,"2019"));
        visitors.add(new PieEntry(208,"2020"));

        PieDataSet pieDataSet = new PieDataSet(visitors,"Pie Chart Example");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.WHITE);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Visitors");
        pieChart.animate();
    }
}