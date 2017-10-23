package jp.ac.it_hiroshima.yonezawacc.gurahu2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

/**
 * Created by hp on 2016/08/14.
 */

public class GraphLineActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colored_lines);

        LineChart lineChart = (LineChart)findViewById(R.id.chart1);

        //グラフ用データ
        ArrayList<Entry> entries = new ArrayList<Entry>();
        entries.add(new Entry(60f,0));
        entries.add(new Entry(50f,1));
        entries.add(new Entry(58f,2));
        entries.add(new Entry(60f,3));
        entries.add(new Entry(65f,4));
        entries.add(new Entry(80f,5));
        entries.add(new Entry(78f,6));

        //データをセット
        LineDataSet dataSet = new LineDataSet(entries,"weight");

        //ラベル
        String[] labels = {"2015","2016","2017","2018","2019","2020","2021"};

        //LineDataインスタンス生成
        LineData data = new LineData(labels,dataSet);

        //LineDataをLineChartにセット
        lineChart.setData(data);

        //説明分
        lineChart.setDescription("体重の遷移");

        //背景色
        lineChart.setBackgroundColor(Color.WHITE);

        //アニメーション
        lineChart.animateX(1200);

    }
}
