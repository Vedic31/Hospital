package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Old_USer_2 extends AppCompatActivity {

    Button det , addcre , addnur , adddoc , addmed , discharge , addtest ,bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old__u_ser_2);
        Bundle b = getIntent().getExtras();
        final String data = b.getString("data");
        det = (Button)findViewById(R.id.detail);
        addtest = (Button)findViewById(R.id.AddTest);
        addnur = (Button)findViewById(R.id.Nurse);
        adddoc = (Button)findViewById(R.id.DocVisit);
        discharge = (Button)findViewById(R.id.Discharge);
        bck = (Button)findViewById(R.id.ToOLd);
        det.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Old_USer_2.this , ShowDetail.class);
                i.putExtra("data" , data);
                startActivity(i);
            }
        });

        //----------------------------
        addtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Old_USer_2.this ,TEST.class );
                i.putExtra("data" , data);
                startActivity(i);
            }
        });
        //----------------------------
        addnur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Old_USer_2.this , NurseVisit.class);
                i.putExtra("data" , data);
                startActivity(i);
            }
        });
        //--------------------------------
        adddoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Old_USer_2.this ,AddingDoctorVisit.class );
                i.putExtra("data" , data);
                startActivity(i);
            }
        });

        //--------------------------------------
        discharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Old_USer_2.this , Discharge.class);
                i.putExtra("data" , data);
                startActivity(i);
            }
        });
        //--------------------------------------
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Old_USer_2.this , OldUser.class);
                startActivity(i);
            }
        });
    }
}
