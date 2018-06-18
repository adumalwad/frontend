package com.example.anupdumalwad.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private TextView Existing;
    private TextView New;
    private Button Login;
    private Button Student;
    private Button Professor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Email = (EditText)findViewById(R.id.etEmaiIid);
    Password = (EditText)findViewById(R.id.etPassword);
    Existing = (TextView)findViewById(R.id.tvExistuser);
    New = (TextView)findViewById(R.id.tvNewuser);
    Login = (Button)findViewById(R.id.btnLogin);
    Student = (Button)findViewById(R.id.btnStudent);
    Professor = (Button)findViewById(R.id.btnProfessor);

    Login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        validate(Email.getText().toString(),Password.getText().toString());
        }
    });


    }
    public void nextpage(View view){
        Intent startnewactivity = new Intent(this,studentsignup.class);
        startActivity(startnewactivity);
    }
    public void nextpage2(View view){
        Intent startnewactivity2 = new Intent(this,professorsignup.class);
        startActivity(startnewactivity2);
    }

    private void validate(String inputid,String inputPassword){
        if((inputid.equals("anup"))&&(inputPassword.equals("happy"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    }

}
