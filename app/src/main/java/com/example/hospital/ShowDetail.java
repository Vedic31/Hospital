package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShowDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
        Bundle b = getIntent().getExtras();
        String data = b.getString("data");
        String splitter [] = data.split("  ");
        EditText n , age , address , disease , penamt , mobnum ;
        n = (EditText)findViewById(R.id.N);
        age = (EditText)findViewById(R.id.AG);
        address = (EditText)findViewById(R.id.ADDRESS);
        penamt = (EditText)findViewById(R.id.AMTPEND);
        mobnum = (EditText)findViewById(R.id.MNUM);
        disease = (EditText)findViewById(R.id.DIS);
        Button back = (Button)findViewById(R.id.button5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ShowDetail.this , Old_USer_2.class);
                startActivity(i);
            }
        });
        n.setText(splitter[0]);
        age.setText(splitter[1]);
        mobnum.setText(splitter[2]);
        address.setText(splitter[3]);
        penamt.setText(splitter[5]);
        disease.setText(splitter[4]);
    }
}
