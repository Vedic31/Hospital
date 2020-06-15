package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewUser2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user2);
        Bundle b = getIntent().getExtras();
        final String Data = b.getString("data");
        final EditText m , a ;
        m = (EditText)findViewById(R.id.mobilenumber);
        a = (EditText)findViewById(R.id.address);
        Button n , ba ;
        ba = (Button)findViewById(R.id.bcknew);
        n = (Button)findViewById(R.id.nxt);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = Data+m.getText().toString()+"  "+a.getText().toString();
                Intent i = new Intent(NewUser2.this , NewUser3.class);
                i.putExtra("data" , str);
                startActivity(i);
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewUser2.this , NewUser.class);
                startActivity(i);
            }
        });
    }
}
