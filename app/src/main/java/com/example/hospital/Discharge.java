package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Discharge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discharge);
        Bundle b = getIntent().getExtras();
        String str[] = b.getString("data").split("  ");
        EditText amt = (EditText)findViewById(R.id.editText2);
        amt.setText(str[5]);
        Button d , ba;
        d = (Button)findViewById(R.id.discharge);
        ba = (Button)findViewById(R.id.bckdis);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Discharge.this , MainActivity.class);
                startActivity(i);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_LONG ).show();
                Intent i = new Intent(Discharge.this , MainActivity.class);
                startActivity(i);
            }
        });
    }
}
