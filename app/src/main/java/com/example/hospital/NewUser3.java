package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewUser3 extends AppCompatActivity {

    Button back , asth , injmin , injmax , checkup , ha , cc , covid , cust;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user3);
        Bundle b = getIntent().getExtras();
        final String data = b.getString("data")+"  ";
        back = (Button)findViewById(R.id.BCK);
        asth = (Button)findViewById(R.id.Asthma);
        injmax = (Button)findViewById(R.id.Injmax);
        injmin = (Button)findViewById(R.id.InjuryMin);
        checkup = (Button)findViewById(R.id.checkup);
        ha = (Button)findViewById(R.id.Heart_attack);
        cc = (Button)findViewById(R.id.common_cold);
        covid = (Button)findViewById(R.id.Ncovid);
        cust = (Button)findViewById(R.id.custom_disease);
        //--------------------------------------------------------------------------------
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewUser3.this , NewUser2.class);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        asth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = data+"asthma"+"  "+"15000";
                Intent i = new Intent(NewUser3.this , Confirm.class);
                i.putExtra("data" , temp);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        injmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = data+"minor injury"+"  "+"1000";
                Intent i = new Intent(NewUser3.this , Confirm.class);
                i.putExtra("data" , temp);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        injmax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = data+"major injury"+"  "+"3000";
                Intent i = new Intent(NewUser3.this , Confirm.class);
                i.putExtra("data" , temp);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        checkup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = data+"checkup"+"  "+"500";
                Intent i = new Intent(NewUser3.this , Confirm.class);
                i.putExtra("data" , temp);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = data+"heart attack"+"  "+"50000";
                Intent i = new Intent(NewUser3.this , Confirm.class);
                i.putExtra("data" , temp);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = data+"common cold"+"  "+"200";
                Intent i = new Intent(NewUser3.this , Confirm.class);
                i.putExtra("data" , temp);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = data+"novel corona virus"+"  "+"0";
                Intent i = new Intent(NewUser3.this , Confirm.class);
                i.putExtra("data" , temp);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
        cust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewUser3.this , CustomDisease.class);
                i.putExtra("data" , data);
                startActivity(i);
            }
        });
        //--------------------------------------------------------------------------------
    }
}
