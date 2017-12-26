package com.example.user.atm1029;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static final String TAG = CityActivity.class.getSimpleName() ;
    private  String[] cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        ListView city =  (ListView) findViewById(R.id.city);
        String[] cities = {"新北市","基隆市","台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,
                cities);
        city.setAdapter(adapter);
        city.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d(TAG,"onItemClick"+position + "/"+ cities[position]);
        TextView tv = (TextView) view;
        tv.setText(tv.getText()+"*");

    }
}
