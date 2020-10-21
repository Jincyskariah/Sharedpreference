package com.example.sharedpreference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
    EditText name,password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=findViewById(R.id.namelogin);
        password=findViewById(R.id.passwordlgin);
        register=findViewById(R.id.login);

      register.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              String inputname=name.getText().toString();
              String inputpass=password.getText().toString();
              SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("pref",MODE_PRIVATE);
              SharedPreferences.Editor editor=sharedPreferences.edit();
              editor.putString("key1",inputname);
              editor.putString("key2",inputpass);
              editor.apply();
              Intent intent=new Intent(register.this,MainActivity.class);
              startActivity(intent);
          }

      });
    }
}
