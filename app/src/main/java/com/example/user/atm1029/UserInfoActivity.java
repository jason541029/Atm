package com.example.user.atm1029;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {
    private EditText edName;
    private EditText edPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        String name = getSharedPreferences("atm",MODE_PRIVATE)
                .getString("NickName", " jason");
        String phone = getSharedPreferences("atm",MODE_PRIVATE)
                .getString("Phone", "0976219968");
        edName =findViewById(R.id.ed_nickname);
        edPhoneNumber = findViewById(R.id.ed_phone);
        edName.setText(name);
        edPhoneNumber.setText(phone);

    }
public void ok(View view) {
        EditText edNickname = findViewById(R.id.ed_nickname);
        EditText edPhone = findViewById(R.id.ed_phone);
        String nickname = edNickname.getText().toString();
       String phone = edPhone.getText().toString();
       getIntent().putExtra("EXTRA_NICKNAME", nickname);
       getIntent().putExtra("EXTRA_PHONE" , phone);
       setResult(RESULT_OK, getIntent());
       finish();



}
}
