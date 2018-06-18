package com.example.anupdumalwad.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class professorsignup extends AppCompatActivity {

    private EditText Name;
    private EditText Email;
    private EditText password1;
    private EditText validpassword;
    private TextView Info;
    private Button Signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professorsignup);

        Name=(EditText) findViewById(R.id.editname);
        Email=(EditText) findViewById(R.id.editpassword);
        password1=(EditText) findViewById(R.id.editpassword);
        validpassword=(EditText) findViewById(R.id.editvalid);
        Info=(TextView) findViewById(R.id.edittext);
        Signup=(Button) findViewById(R.id.editbutton);

        password1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if( (password1.getText().length()<8) || (password1.getText()!=validpassword.getText()) ) {
                    password1.setError("Please Enter Valid Password");
                }
            }

        });
    }

}
