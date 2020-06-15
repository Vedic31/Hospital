package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EarningReset extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earning_reset);
        /* in the following Screen , i have made sure that the ui is done in such a way that user has
        to think while clicking the button on the screen which will prevent accidential clicking of
        reset button
         */
        Button reset , back;
        back = (Button)findViewById(R.id.Abort);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EarningReset.this , MainActivity.class);
                startActivity(i);
            }
        });
        reset = (Button)findViewById(R.id.Reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Savedata("0");
                Toast.makeText(getApplicationContext(), "success ", Toast.LENGTH_LONG).show();
                Intent i = new Intent(EarningReset.this , MainActivity.class);
                startActivity(i);
            }
        });
    }
    //----------------------------------------------------------------------------------------------
    //---------- the following function will save the text file ------------------------------------
    //----------------------------------------------------------------------------------------------
    public void Savedata(String data ){
        String fname = "earning_user_2001";
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
}
