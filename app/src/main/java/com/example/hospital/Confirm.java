package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        Bundle b = getIntent().getExtras();
        final String data = b.getString("data");
        final String[] slicer = data.split("  ");
        EditText amount = (EditText)findViewById(R.id.diss);
        amount.setText(slicer[5]);
        EditText p = (EditText)findViewById(R.id.prob);
        p.setText(slicer[4]);
        Button bu , n;
        bu = (Button)findViewById(R.id.button);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Confirm.this , NewUser3.class);
                startActivity(i);
            }
        });
        n = (Button)findViewById(R.id.button2);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent i = new Intent(Confirm.this , MainActivity.class);
                    String phno = slicer[2];
                    Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_LONG ).show();
                    converter(slicer[5]);
                    Savedata(data , phno);
                    startActivity(i);
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    //**********************************************************************************************
    //**********************************************************************************************
    //**********************************************************************************************
    public void Savedata(String data , String fname){
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream =
                    fileOutputStream = openFileOutput(fname , Context.MODE_PRIVATE);
                    fileOutputStream.write(data.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //------------------------------------------------------------------------
    private void converter(String a){
        int amt_earned = Integer.parseInt(GetData());
        amt_earned+=Integer.parseInt(a);
        Savedata(Integer.toString(amt_earned) , "earning_user_2001");
    }
    //**********************************************************************************************
    //**********************************************************************************************
    //**********************************************************************************************
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
    //**********************************************************************************************
    //**********************************************************************************************
    //**********************************************************************************************
}

