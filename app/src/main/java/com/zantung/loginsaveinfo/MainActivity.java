package com.zantung.loginsaveinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText User, pass;
    CheckBox cbSavePass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    private void anhxa() {
        btnLogin = (Button) findViewById(R.id.btn_login);
        User = (EditText) findViewById(R.id.inputUser);
        pass = (EditText) findViewById(R.id.inputPassword);
        cbSavePass = (CheckBox) findViewById(R.id.cbRemember);
    }
}