package com.example.isafe0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {




    FloatingActionButton siren,fab,extendedFloatingActionButton;
    ScrollView nestedScrollView;

    CardView info,helper,location,add,call1,call2,call3,call4,call5,call6,call7,call8,call9,search,message,camera,siren1;
    Button button_capture;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        // register the extended floating action Button
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final ExtendedFloatingActionButton extendedFloatingActionButton = findViewById(R.id.extendedFloatingActionButton);

        // register the nestedScrollView from the main layout
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) NestedScrollView nestedScrollView = findViewById(R.id.nestedScrollView);

        // handle the nestedScrollView behaviour with OnScrollChangeListener
        // to extend or shrink the Extended Floating Action Button
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                // the delay of the extension of the FAB is set for 12 items
                if (scrollY > oldScrollY + 12 && extendedFloatingActionButton.isExtended()) {
                    extendedFloatingActionButton.shrink();
                }

                // the delay of the extension of the FAB is set for 12 items
                if (scrollY < oldScrollY - 12 && !extendedFloatingActionButton.isExtended()) {
                    extendedFloatingActionButton.extend();
                }

                // if the nestedScrollView is at the first item of the list then the
                // extended floating action should be in extended state
                if (scrollY == 0) {
                    extendedFloatingActionButton.extend();
                }
            }
        });


        camera = findViewById(R.id.camera);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,send_photo.class));
            }
        });

        helper = findViewById(R.id.helper);
        helper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,addrelatives.class));
            }
        });

        info = findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,helper_blogs.class));
            }
        });

        message= findViewById(R.id.message);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,emargency.class));
            }
        });

        findViewById(R.id.extendedFloatingActionButton);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.police1);

        extendedFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        location = findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, location.class);
                startActivity(i);
            }
        });

//        nestedScrollView = findViewById(R.id.nestedScrollView);
////       fab = findViewById(R.id.fab);
//






//            call1 = findViewById(R.id.call1);
//            call1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent i = new Intent(Intent.ACTION_DIAL);
//                    i.setData(Uri.parse("tel:" +100));
//                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                        return;
//                    }
//                    startActivity(i);
//                }
//            });

        call1 = findViewById(R.id.call1);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" +100));
                startActivity(i);
            }
        });


            call2 = findViewById(R.id.call2);
            call2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phonenumber = "1091";
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" + phonenumber));
                    startActivity(i);
                }
            });
            call3 = findViewById(R.id.call3);
            call3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" +182));
                    startActivity(i);
                }
            });
            call4 = findViewById(R.id.call4);
            call4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" +1930));
                    startActivity(i);
                }
            });
            call5 = findViewById(R.id.call5);
            call5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" +102));
                    startActivity(i);
                }
            });
            call6 = findViewById(R.id.call6);
            call6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" +1098));
                    startActivity(i);
                }
            });
            call7 = findViewById(R.id.call7);
            call7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" +108));
                    startActivity(i);
                }
            });
            call8 = findViewById(R.id.call8);
            call8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" +14567));
                    startActivity(i);
                }
            });
            call9 = findViewById(R.id.call9);
            call9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" +112));
                    startActivity(i);
                }
            });

            add = findViewById(R.id.add);
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, addinfo.class);
                    startActivity(i);
                }
            });

            search = findViewById(R.id.search);
            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, activity_magnetometer.class);
                    startActivity(i);
                }
            });
        }

    }
