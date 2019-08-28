package com.example.eman_hamad.ondemanddoctor;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class AppIntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_app_intro);
        addSlide(AppIntroFragment.newInstance("Discover & Book On-Demand Docotrs",
                "Explore available doctors, book instant appointment.",
                R.drawable.doctors, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance("Chat with Our Chatbot For Free",
                "Check your symptoms with our chatbot so that you can have best triage.",
                R.drawable.chat, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance("Chat with Docotrs Around The Globe",
                "Our Docotrs be available for Tele-Medicine anytime.",
                R.drawable.global, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance("Doctor on Your Doorstep",
                "Our Docotrs be available for Tele-Medicine anytime.",
                R.drawable.doorstep, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark)));
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
}
