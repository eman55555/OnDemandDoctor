package com.example.eman_hamad.ondemanddoctor;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.annotation.ColorLong;
import android.support.annotation.Dimension;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class Log_In extends Activity implements TabLayout.OnTabSelectedListener {
    //TabHost tabHost1;
    // TabHost.TabSpec Tab1,Tab2,Tab3,Tab4,Tab5;
    private TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__in);
        // TabHost tabHost1 =getTabHost();
        //tabHost1.addTab(tabHost1.newTabSpec("Home").setIndicator("Home").setContent(new Intent(this,Home.class)));
        // tabHost1.addTab(tabHost1.newTabSpec("Records").setIndicator("Records").setContent(new Intent(this,Records.class)));
        //tabHost1.addTab(tabHost1.newTabSpec("Book").setIndicator("Book").setContent(new Intent(this,Book.class)));
        // tabHost1.addTab(tabHost1.newTabSpec("Appointment").setIndicator("Appointment").setContent(new Intent(this,Appointment.class)));
        //  tabHost1.addTab(tabHost1.newTabSpec("Profile").setIndicator("Profile").setContent(new Intent(this,Profile.class)));
        //  tabHost1.setCurrentTab(0);
        //tabHost1 =(TabHost)findViewById(R.id.tabhost);
        //tabHost1.setup();
        // tabHost1.addTab(tabHost1.newTabSpec("Home").setIndicator("Home").setContent(new Intent(this,Home.class)));
        //tabHost1.addTab(tabHost1.newTabSpec("Home").setContent(R.id.tab1));
        //  tabHost1.addTab(tabHost1.newTabSpec("Records").setIndicator("Records").setContent(new Intent(this,Records.class)));
        //tabHost1.addTab(tabHost1.newTabSpec("Records").setContent(R.id.tab2));
        // tabHost1.addTab(tabHost1.newTabSpec("Book").setIndicator("Book").setContent(new Intent(this,Book.class)).setContent(R.id.tab3));
        // tabHost1.addTab(tabHost1.newTabSpec("Appointment").setIndicator("Appointment").setContent(new Intent(this,Appointment.class)).setContent(R.id.tab4));
        // tabHost1.addTab(tabHost1.newTabSpec("Profile").setIndicator("Profile").setContent(new Intent(this,Profile.class)).setContent(R.id.tab5));
        //tabHost1.setCurrentTab(0);
        //tab1
        //Tab1 =tabHost1.newTabSpec("tag1");
        // Tab1.setContent(R.id.tab1);
        // Tab1.setIndicator("Hom");
        //Tab1.setContent(new Intent(this,Home.class));
        //tabHost1.addTab(Tab1);

       /* tabHost1.setOnClickListener(new View.OnClickListener(){
                public void onClick (View v){
                    Intent i = new Intent(Log_In.this, Home.class);
                    startActivity(i);
                }

        });*/


        //tab2
      /*  Tab2 =tabHost1.newTabSpec("tag2");
        Tab2.setContent(R.id.tab2);
        Tab2.setIndicator("Records");
        tabHost1.addTab(Tab2);
        //tab3
        Tab3 =tabHost1.newTabSpec("tag3");
        Tab3.setContent(R.id.tab3);
        Tab3.setIndicator("Book");
        tabHost1.addTab(Tab3);
        //tab4
        Tab4 =tabHost1.newTabSpec("tag4");
        Tab4.setContent(R.id.tab4);
        Tab4.setIndicator("Appointment");
        tabHost1.addTab(Tab4);
        //tab5
        Tab5 =tabHost1.newTabSpec("tag5");
        Tab5.setContent(R.id.tab5);
        Tab5.setIndicator("Profile");
        tabHost1.addTab(Tab5);

        tabHost1.getTabWidget().getChildTabViewAt(0).getMeasuredWidth();
       // tabHost1.isTextAlignmentResolved(tex);
        tabHost1.setOnTabChangedListener(this);

    }

    @Override
    public void onTabChanged(String tabId) {
        if(tabId.equals("tag1"))
        {
          Tab1.setContent(new Intent(this,Home.class));

        }

   */
       //getSupporActionBar().getElevation(0);
        final Button get_started=findViewById(R.id.button);
        get_started.setText("Get Started");
        get_started.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Log_In.this, Start.class);
                startActivity(i);
            }
        });

        tab = (TabLayout)findViewById(R.id.tab1);
        tab.addTab(tab.newTab().setText("Home").setIcon(R.drawable.home));
        tab.addTab(tab.newTab().setText("Records").setIcon(R.drawable.records));
        tab.addTab(tab.newTab().setText("Book").setIcon(R.drawable.book));
        tab.addTab(tab.newTab().setText("Appointment").setIcon(R.drawable.appointment));
        tab.addTab(tab.newTab().setText("Profile").setIcon(R.drawable.profile));
//tab.setTabTextColors(ContextCompat.getColor(this,android.R.color.darker_gray),
        //ContextCompat.getColor(this,android.R.color.white));
       // tab.setBackgroundColor(ContextCompat.getColor(this,android.R.color.holo_green_dark));

tab.addOnTabSelectedListener(this);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        tab.getIcon().setColorFilter(Color.WHITE,PorterDuff.Mode.DST_ATOP);
        //tab.getTabAt(0).getIcon().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
       // tab.getIcon().setColorFilter(Color.parseColor("#cccccc"),PorterDuff.Mode.DST_ATOP);
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {


    }
}
