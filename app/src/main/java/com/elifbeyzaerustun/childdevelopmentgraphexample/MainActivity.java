package com.elifbeyzaerustun.childdevelopmentgraphexample;

import android.graphics.Color;
import android.os.Bundle;
import android.util.EventLogTags;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    float[] pieChartPercentagesArr = {30, 40, 50, 60};

    float[] pieChart1PercentagesArr = {pieChartPercentagesArr[0],100-pieChartPercentagesArr[0]};
    float[] pieChart2PercentagesArr = {pieChartPercentagesArr[1], 100-pieChartPercentagesArr[1]};
    float[] pieChart3PercentagesArr = {pieChartPercentagesArr[2], 100-pieChartPercentagesArr[2]};
    float[] pieChart4PercentagesArr = {pieChartPercentagesArr[3], 100-pieChartPercentagesArr[3]};
    String[] textOnPieChartsArr = {" ", " ", " ", " "};

    PieChart pieChart1;
    PieChart pieChart2;
    PieChart pieChart3;
    PieChart pieChart4;

    private EventLogTags.Description mDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart1 = findViewById(R.id.piechart1);
        pieChart2 = findViewById(R.id.piechart2);
        pieChart3 = findViewById(R.id.piechart3);
        pieChart4 = findViewById(R.id.piechart4);

        ////////////////////////////////////////////PIE CHART 1..
        ArrayList<Entry> yVals1 = new ArrayList<Entry>();
        for(int i = 0; i < pieChart1PercentagesArr.length; i++){
            yVals1.add(new Entry(pieChart1PercentagesArr[i],0));
        }

        ArrayList<String> xVals = new ArrayList<String>();
        for(int i = 0; i < textOnPieChartsArr.length; i++){
            xVals.add(textOnPieChartsArr[i]);
        }

        PieDataSet pieDataSet1 = new PieDataSet(yVals1, " ");

        int purpleColorValue = Color.parseColor("#7427CF");
        int whiteColorValue = Color.parseColor("#ffffff");


        ArrayList<Integer> colorsForPieChart1 = new ArrayList<>();
        colorsForPieChart1.add(purpleColorValue);
        colorsForPieChart1.add(whiteColorValue);
        pieDataSet1.setColors(colorsForPieChart1);

        PieData pieData = new PieData(xVals,pieDataSet1);
        pieDataSet1.setDrawValues(false);
        pieChart1.setData(pieData);
        pieChart1.highlightValues(null);

        pieChart1.animateY(2000);
        pieChart1.setDescription(" ");
        pieChart1.getLegend().setEnabled(false);

        pieChart1.setRotationAngle(270);
        pieChart1.setRotationEnabled(true);
        pieChart1.invalidate();

        ////////////////////////////////////////////////PIE CHART 2..
        ArrayList<Entry> yVals2 = new ArrayList<Entry>();
        for(int i = 0; i < pieChart2PercentagesArr.length; i++){
            yVals2.add(new Entry(pieChart2PercentagesArr[i],0));
        }

        PieDataSet pieDataSet2 = new PieDataSet(yVals2, " ");

        int orangeColorValue = Color.parseColor("#E5A63A");
        int whiteColorValue2 = Color.parseColor("#ffffff");


        ArrayList<Integer> colorsForPieChart2 = new ArrayList<>();
        colorsForPieChart2.add(orangeColorValue);
        colorsForPieChart2.add(whiteColorValue2);
        pieDataSet2.setColors(colorsForPieChart2);

        PieData pieData2 = new PieData(xVals,pieDataSet2);
        pieDataSet2.setDrawValues(false);
        pieChart2.setData(pieData2);
        pieChart2.highlightValues(null);

        pieChart2.setRotationAngle(270);
        pieChart2.setRotationEnabled(true);
        pieChart2.getLegend().setEnabled(false);
        pieChart2.animateY(2000);
        pieChart2.setDescription(" ");
        pieChart2.invalidate();

        /////////////////////////////////////////////////PIE CHART 3..
        ArrayList<Entry> yVals3 = new ArrayList<Entry>();
        for(int i = 0; i < pieChart3PercentagesArr.length; i++){
            yVals3.add(new Entry(pieChart3PercentagesArr[i],0));
        }

        PieDataSet pieDataSet3 = new PieDataSet(yVals3, " ");

        int greenColorValue = Color.parseColor("#50B5F9");
        int whiteColorValue3 = Color.parseColor("#ffffff");

        ArrayList<Integer> colorsForPieChart3 = new ArrayList<>();
        colorsForPieChart3.add(greenColorValue);
        colorsForPieChart3.add(whiteColorValue3);
        pieDataSet3.setColors(colorsForPieChart3);

        PieData pieData3 = new PieData(xVals,pieDataSet3);
        pieDataSet3.setDrawValues(false);
        pieChart3.setData(pieData3);
        pieChart3.highlightValues(null);

        pieChart3.setRotationAngle(270);
        pieChart3.setRotationEnabled(true);
        pieChart3.getLegend().setEnabled(false);
        pieChart3.animateY(2000);
        pieChart3.setDescription(" ");
        pieChart3.invalidate();

        /////////////////////////////////////////////////////PIE CHART 4..
        ArrayList<Entry> yVals4 = new ArrayList<Entry>();
        for(int i = 0; i < pieChart4PercentagesArr.length; i++){
            yVals4.add(new Entry(pieChart4PercentagesArr[i],0));
        }

        PieDataSet pieDataSet4 = new PieDataSet(yVals4, " ");

        int pinkColorValue = Color.parseColor("#E8427C");
        int whiteColorValue4 = Color.parseColor("#ffffff");

        ArrayList<Integer> colorsForPieChart4 = new ArrayList<>();
        colorsForPieChart4.add(pinkColorValue);
        colorsForPieChart4.add(whiteColorValue4);
        pieDataSet4.setColors(colorsForPieChart4);

        PieData pieData4 = new PieData(xVals,pieDataSet4);
        pieDataSet4.setDrawValues(false);
        pieChart4.setData(pieData4);
        pieChart4.highlightValues(null);

        pieChart4.setRotationAngle(270);
        pieChart4.setRotationEnabled(true);
        pieChart4.getLegend().setEnabled(false);
        pieChart4.animateY(2000);
        pieChart4.setDescription(" ");
        pieChart4.invalidate();

    }
    public void setDescription(EventLogTags.Description description){
        this.mDescription = description;
    }

}