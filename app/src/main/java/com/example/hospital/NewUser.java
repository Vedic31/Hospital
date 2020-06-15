package com.example.hospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        Button back = (Button)findViewById(R.id.Back_New_1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewUser.this , MainActivity.class);
                startActivity(i);
            }
        });
        final EditText n , a ;
        n = (EditText)findViewById(R.id.Name);
        a = (EditText)findViewById(R.id.Age);
        Button next = (Button)findViewById(R.id.Next_new_1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewUser.this , NewUser2.class);
                String temp = n.getText().toString()+"  "+a.getText().toString()+"  ";
                i.putExtra("data" , temp);
                startActivity(i);
            }
        });
    }
}
