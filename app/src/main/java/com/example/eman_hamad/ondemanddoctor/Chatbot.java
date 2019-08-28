package com.example.eman_hamad.ondemanddoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Chatbot extends AppCompatActivity {
    private DatabaseReference myDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        myDatabase = FirebaseDatabase.getInstance().getReference("message");
        final TextView chat1 = findViewById(R.id.message1);
        myDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                chat1.setText((CharSequence) dataSnapshot.getValue().toString());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                chat1.setText("CANCELLED");

            }
        });
    }

    public void sendMessage(View view) {
      final EditText chat2 = findViewById(R.id.editText1);
        myDatabase.setValue(chat2.getText().toString());
        chat2.setText("");
    }
}
       /* final Button send_btn = findViewById(R.id.send_button);
        send_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText chat2 = findViewById(R.id.editText1);
                myDatabase.setValue(chat2.getText().toString());
                chat2.setText("");
            }

        });


    }*/

