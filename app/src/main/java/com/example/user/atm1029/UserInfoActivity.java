package com.example.user.atm1029;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {
    private EditText edName;
    private EditText edPhoneNumber;
    private String TAG = UserInfoActivity.class.getSimpleName();
    private Spinner ages;
 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        Spinner ages = (Spinner) findViewById(R.id.ages);
       // ArrayList<String> data = new ArrayList<>();
    //    for (int i = 15; i <= 40; i++) {
     //       data.add(i + "");
       // }
        String[] data = getResources().getStringArray(R.array.ages);
        ArrayAdapter adapter = new ArrayAdapter(this,R.array.ages,android.R.layout.simple_list_item_1);
        ages.setAdapter(adapter);

Intent addr2 = new Intent(this,Addr2Activity.class);
startActivity(addr2);
        String name = getSharedPreferences("atm",MODE_PRIVATE)
                .getString("NickName", " ");
        String phone = getSharedPreferences("atm",MODE_PRIVATE)
                .getString("Phone", " ");
        edName = findViewById(R.id.ed_name);
        edPhoneNumber = findViewById(R.id.ed_phonenumber);
        edName.setText(name);
        edPhoneNumber.setText(phone);


    }
public void ok(View view) {
    Log.d(TAG,"ok:"+ages.getSelectedItem().toString());
    int age = Integer.parseInt(ages.getSelectedItem().toString());
        EditText edNickname = findViewById(R.id.ed_name);
        EditText edPhone = findViewById(R.id.ed_phonenumber);
        String nickname = edNickname.getText().toString();
       String phone = edPhone.getText().toString();
       getIntent().putExtra("EXTRA_NICKNAME", nickname);
       getIntent().putExtra("EXTRA_PHONE" , phone);
       setResult(RESULT_OK, getIntent());
       finish();



}
}
