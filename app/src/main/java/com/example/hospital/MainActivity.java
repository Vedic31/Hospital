package com.example.hospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newu , oldu , et , er , dev ;
        newu = (Button)findViewById(R.id.new_user);
        oldu = (Button)findViewById(R.id.Old_user);
        et = (Button)findViewById(R.id.earning_teller);
        er = (Button)findViewById(R.id.earning_reset);
        dev = (Button)findViewById(R.id.button3);

        //---------------------------------------------------------------------------------
        newu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , NewUser.class);
                startActivity(i);
            }
        });
        //-----------------------------------------------------------------------------------
        oldu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , OldUser.class);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        er.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , EarningReset.class);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , EarningTeller.class);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------------
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , DEV.class);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------

    }
}
