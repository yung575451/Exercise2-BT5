package com.hungphamcom.exercise2_bt5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btngg;
    private Button btncall;
    private Button btnDial;
    private Button btnContact;
    private Button btnSendText;
    private Button btnImage;
    private Button btnSong;
    private Button btnMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngg=findViewById(R.id.bthgg);
        btncall=findViewById(R.id.btnCall);
        btnDial=findViewById(R.id.btnDial);
        btnContact=findViewById(R.id.btnContact);
        btnSendText=findViewById(R.id.btnSendText);
        btnImage=findViewById(R.id.btnImage);
        btnSong=findViewById(R.id.btnSong);
        btnMap=findViewById(R.id.btnMap);


        View.OnClickListener Click=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(intent);
            }
        };

        btngg.setOnClickListener(Click);

        View.OnClickListener call=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_CALL,Uri.parse("tel:(+49)123456789"));
            }
        };

        btncall.setOnClickListener(call);

        View.OnClickListener dial=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:(+49)123456789"));
            }
        };

        btnDial.setOnClickListener(dial);

        View.OnClickListener contact=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
            }
        };

        btnDial.setOnClickListener(dial);

        View.OnClickListener sendtext=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:5551234"));
                intent.putExtra("sms_body","thu bay nay di choi khong?");
            }
        };

        btnSendText.setOnClickListener(sendtext);

        View.OnClickListener image=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent();
                myIntent.setType("image/pictures/*");
                myIntent.setAction(Intent.ACTION_GET_CONTENT);
                startActivity(myIntent);
            }
        };

        btnImage.setOnClickListener(image);

        View.OnClickListener song=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song=new Intent("android.intent.action.MUSIC_PLAYER");
                startActivity(song);
            }
        };

        btnSong.setOnClickListener(song);

        View.OnClickListener map=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://maps.google.com?maps?"+"saddr=9.938083,-84.054430&daddr=9.926392,-84.055964";
                Intent map=new Intent(Intent.ACTION_VIEW,Uri.parse(url));

                startActivity(map);
            }
        };

        btnMap.setOnClickListener(map);
    }

}