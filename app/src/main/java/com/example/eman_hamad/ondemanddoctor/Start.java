package com.example.eman_hamad.ondemanddoctor;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Start extends AppCompatActivity implements TabLayout.OnTabSelectedListener,AdapterView.OnItemClickListener {
    private TabLayout tab;
    String [] choices={"Chatbot","Visit a Clinic","Online Consultation","House calls"};
    String [] description={"Continue chatting with me","Book an Appointment","Chat with Our Doctors Online","Book House Visits"};
    int []  images ={R.drawable.chatbot,R.drawable.visit_a_clinic,R.drawable.online_consultation,R.drawable.house_calls};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        final ListView list_view=(ListView)findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,choices);
        list_view.setAdapter(arrayAdapter);
       // list_view.addView(R.drawable.appointment);


        tab = (TabLayout) findViewById(R.id.tab2);
        tab.addTab(tab.newTab().setText("Home").setIcon(R.drawable.home));
        tab.addTab(tab.newTab().setText("Records").setIcon(R.drawable.records));
        tab.addTab(tab.newTab().setText("Book").setIcon(R.drawable.book));
        tab.addTab(tab.newTab().setText("Appointment").setIcon(R.drawable.appointment));
        tab.addTab(tab.newTab().setText("Profile").setIcon(R.drawable.profile));

        tab.addOnTabSelectedListener(this);

        final ListView List=findViewById(R.id.list);
        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Start.this, Chatbot.class);
                i.putExtra("",List.getItemIdAtPosition(position));
                startActivity(i);
            }
        });
   }
   @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        tab.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.DST_ATOP);
        //tab.getTabAt(0).getIcon().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        // tab.getIcon().setColorFilter(Color.parseColor("#cccccc"),PorterDuff.Mode.DST_ATOP);
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

