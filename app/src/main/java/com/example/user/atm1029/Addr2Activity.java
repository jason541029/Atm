package com.example.user.atm1029;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Addr2Activity extends AppCompatActivity {
private Spinner spCity;
private Spinner spArea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr2);
        spCity = (Spinner)findViewById(R.id.sp_city);
        spArea = (Spinner)findViewById(R.id.sp_area);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,
        new String[]{"AA","BB","CC"});
        spCity.setAdapter(adapter);
        spCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ArrayAdapter adapter1 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,
                        );
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
