package com.example.eman_hamad.ondemanddoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button finish=findViewById(R.id.finish);
       finish.setText("Finish");
       finish.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v) {
               Intent i = new Intent(MainActivity.this, Log_In.class);
               startActivity(i);
           }
       });
    }
}
