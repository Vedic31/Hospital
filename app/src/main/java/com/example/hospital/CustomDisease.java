package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomDisease extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_disease);
        Button n , bck;
        Bundle b = getIntent().getExtras();
        final String data = b.getString("data");
        final EditText d , a;
        d = (EditText)findViewById(R.id.diss);
        a = (EditText)findViewById(R.id.amt);
        n = (Button)findViewById(R.id.button4);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = data+d.getText().toString()+"  "+a.getText().toString();
                Intent i = new Intent(CustomDisease.this , Confirm.class);
                i.putExtra("data" ,temp );
                startActivity(i);
            }
        });
    }
}
