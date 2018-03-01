package com.azkar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mAzkar1, mAzkar2, mAzkar3, mAzkar4, mAzkar5, mAzkar6, mAzkar7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAzkar1 = (Button) findViewById(R.id.azkar_elsbah);
        mAzkar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Azkar.class);
                intent.putExtra("Azkar","AzkarElsabah");
                startActivity(intent);
                finish();
            }
        });
        mAzkar2 = (Button) findViewById(R.id.azkar_elmsaa);
        mAzkar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Azkar.class);
                intent.putExtra("Azkar","AzkarElmasaa");
                startActivity(intent);
                finish();
            }
        });
        mAzkar3 = (Button) findViewById(R.id.azkar_elazan);
        mAzkar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Azkar.class);
                intent.putExtra("Azkar","AzkarElazan");
                startActivity(intent);
                finish();
            }
        });
        mAzkar4 = (Button) findViewById(R.id.azkar_elwdoa);
        mAzkar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Azkar.class);
                intent.putExtra("Azkar","AzkarElwdoa");
                startActivity(intent);
                finish();
            }
        });
        mAzkar5 = (Button) findViewById(R.id.azkar_elsala);
        mAzkar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Azkar.class);
                intent.putExtra("Azkar","AzkarElsalaa");
                startActivity(intent);
                finish();
            }
        });
        mAzkar6 = (Button) findViewById(R.id.azkar_elfood);
        mAzkar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Azkar.class);
                intent.putExtra("Azkar","AzkarElfood");
                startActivity(intent);
                finish();
            }
        });
        mAzkar7 = (Button) findViewById(R.id.azkar_sleep);
        mAzkar7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Azkar.class);
                intent.putExtra("Azkar","AzkarElsleep");
                startActivity(intent);
                finish();
            }
        });
    }
}
