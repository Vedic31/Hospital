package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddingDoctorVisit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_doctor_visit);
        Button n , y;
        n = (Button)findViewById(R.id.Docno);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AddingDoctorVisit.this , Old_USer_2.class);
                startActivity(i);
            }
        });
        y = (Button)findViewById(R.id.Docyes);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = getIntent().getExtras();
                String data = b.getString("data");
                String split[] = data.split("  ");
                int amt = Integer.parseInt(split[5]);
                amt+=500;
                split[5] = Integer.toString(amt);
                String str = "";
                for(int i=0 ; i<split.length ; ++i){
                    str+=split[i];
                    str+="  ";
                }
                converter("500");
                Savedata(str , split[2]);
                Intent i = new Intent(AddingDoctorVisit.this , Old_USer_2.class);
                startActivity(i);
            }
        });
    }
    //----------------------------------------------
    //-----------------------------------------------
    public void Savedata(String data , String fname){
        FileOutputStream fileOutputStream = null;
        try{
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
}
