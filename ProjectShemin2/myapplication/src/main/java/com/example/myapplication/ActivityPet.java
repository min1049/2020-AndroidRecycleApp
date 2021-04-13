package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPet extends AppCompatActivity {

    public static final int sub = 1005;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet);

        Button nextbutton = (Button)findViewById(R.id.next); /*페이지 전환버튼*/

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityPlastic.class);
                startActivityForResult(intent,sub);//액티비티 띄우기
            };
        });

        Button prebutton = (Button)findViewById(R.id.pre);

        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityGlass.class);
                startActivityForResult(intent,sub);//액티비티 띄우기
            };
        });
    };
}