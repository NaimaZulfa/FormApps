package com.imnazu.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.idInputName);
        EditText inputEmail = (EditText) findViewById(R.id.idInputEmail);
        EditText inputPhone = (EditText) findViewById(R.id.eidInputPhone);
        EditText inputPassword =(EditText) findViewById(R.id.idInputPassword);

        Button btnSave = (Button) findViewById(R.id.inButtonSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //action code for click button
                Log.d("--Nama--", inputName.getText().toString());
                Log.d("--Email--", inputEmail.getText().toString());
                Log.d("--Phone--", inputPhone.getText().toString());
                Log.d("--Password--", inputPassword.getText().toString());

            }
        });

    }
}