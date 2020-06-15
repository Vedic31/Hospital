package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EarningTeller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earning_teller);
        Button back = (Button)findViewById(R.id.bckk);
        EditText earning = (EditText)findViewById(R.id.ear);
        String data = GetData();
        earning.setText(data);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EarningTeller.this , MainActivity.class);
                startActivity(i);
            }
        });
    }

    public String GetData(){
        FileInputStream fileInputStream = null;
        String File_data = null;
        try{
            fileInputStream = openFileInput("earning_user_2001");
            int size = fileInputStream.available();
            byte buffer []= new byte[size];
            fileInputStream.read(buffer);
            fileInputStream.close();
            File_data = new String(buffer , "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fileInputStream!=null)
                    fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return File_data;
    }
}
