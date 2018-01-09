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
        final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,
        new String[]{"AA","BB","CC"});
        spCity.setAdapter(adapter);
        spCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[]data = null;
                switch (position){
                    case 0 :
                        data = new String[]{"1","2","3"};
                        break;
                    case 1 :
                        data = new String[]{"4","5","6"};
                        break;
                    case 2 :
                        data = new String[]{"7","8","9"};
                        break;
                }
                ArrayAdapter adapter1 = new ArrayAdapter(
                        Addr2Activity.this,android.R.layout.simple_list_item_1,
                        data);
                spArea.setAdapter(adapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
