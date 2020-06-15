package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OldUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_user);
        Button back , next;
        back = (Button)findViewById(R.id.bckmainold);
        next = (Button)findViewById(R.id.nxtold);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OldUser.this , MainActivity.class);
                startActivity(i);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EditText phno = (EditText) findViewById(R.id.editText);
                    String data = GetData(phno.getText().toString());
                    Intent i = new Intent(OldUser.this, Old_USer_2.class);
                    i.putExtra("data", data);
                    startActivity(i);
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), " User not Found !! ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public String GetData(String fname){
        FileInputStream fileInputStream = null;
        String File_data = null;
        try{
            fileInputStream = openFileInput(fname);
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
