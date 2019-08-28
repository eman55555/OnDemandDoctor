package com.example.eman_hamad.ondemanddoctor;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

public class ClinicVisit extends AppCompatActivity {
    LocationManager locate;
    mylocation LOC;
    String[] permissions = {android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION};
    public static final int request_code = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_visit);
        SearchView search = findViewById(R.id.search_view);
        Button show = findViewById(R.id.button11);
        LOC = new mylocation();
        locate = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ActivityCompat.checkSelfPermission(ClinicVisit.this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(ClinicVisit.this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //
                    ActivityCompat.requestPermissions(ClinicVisit.this, permissions, request_code);
                    //                                       int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                }
                locate.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, LOC);
            }
        });


    }

    class mylocation implements LocationListener {
        @Override
        public void onLocationChanged(Location location) {
            Toast.makeText(ClinicVisit.this, "lacation" + location.getLongitude() + "/n" + location.getLatitude(), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }

        public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

            switch (requestCode) {

                case 1:
                    if (ActivityCompat.checkSelfPermission(ClinicVisit.this, android.Manifest.permission.ACCESS_FINE_LOCATION) !=
                            PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(ClinicVisit.this,
                            android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    } else {
                        locate.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, LOC);
                    }
                    break;

            }
        }
    }
}


