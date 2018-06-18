package com.example.anupdumalwad.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private EditText conf_password;
    private EditText e_mail;
    private Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        conf_password = ((EditText)findViewById(R.id.con_password));
        e_mail = ((EditText)findViewById(R.id.email));
        but = (Button)findViewById(R.id.login);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info(password.getText().toString(),conf_password.getText().toString(),e_mail.getText().toString());
            }
        });
    }


    public void info(String password,String con_password,String e_mail){
        String str = "@iitk.ac.in";
        if(e_mail.contains(str)==false){
            e_mail ="Incorrect email address";

        }
        if(password!=con_password){
            con_password=("Does not match to password");
        }
        if((e_mail.contains(str)==true)&&(password==con_password)){
            Intent next = new Intent(MainActivity.this, third.class);
            startActivity(next);

        }
    }
}
