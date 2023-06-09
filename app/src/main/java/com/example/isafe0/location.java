package com.example.isafe0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class location extends AppCompatActivity {

    String latitude,longtitude;
    CardView police,busstation,hospital,childcare,womenhelp,urban;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        police = findViewById(R.id.police);
        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri gmmIntentUri = Uri.parse("geo:"+latitude+","+longtitude+"0,0?q=police station");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity (mapIntent);

            }
        });
        busstation = findViewById(R.id.busstation);
        busstation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri gmmIntentUri = Uri.parse("geo:"+latitude+","+longtitude+"0,0?q=bus station");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity (mapIntent);

            }
        });
        hospital =findViewById(R.id.hospital);
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri gmmIntentUri = Uri.parse("geo:"+latitude+","+longtitude+"0,0?q=hospital");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity (mapIntent);

            }
        });
        childcare = findViewById(R.id.childcare);
        childcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri gmmIntentUri = Uri.parse("geo:"+latitude+","+longtitude+"0,0?q=childcare");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity (mapIntent);

            }
        });
        womenhelp = findViewById(R.id.womenhelp);
        womenhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri gmmIntentUri = Uri.parse("geo:"+latitude+","+longtitude+"0,0?q=women help center");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity (mapIntent);

            }
        });
        urban = findViewById(R.id.urban);
        urban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri gmmIntentUri = Uri.parse("geo:"+latitude+","+longtitude+"0,0?q=urban center");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity (mapIntent);

            }
        });    }
}