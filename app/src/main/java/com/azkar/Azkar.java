package com.azkar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Azkar extends AppCompatActivity {

    String STR;
    String[] mAzkar;
    TextView mTitle, mNumber, mContent;
    ImageButton mNext, mPrevious, mShare, mBack;
    int i = 1, j = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);
        STR = getIntent().getExtras().getString("Azkar");
        mTitle = (TextView) findViewById(R.id.title);
        mNumber = (TextView) findViewById(R.id.number);
        mContent = (TextView) findViewById(R.id.content);
        mNext = (ImageButton) findViewById(R.id.next);
        mPrevious = (ImageButton) findViewById(R.id.back);
        mShare = (ImageButton) findViewById(R.id.share);
        mBack = (ImageButton) findViewById(R.id.backToMain);
        Context context = getApplicationContext();
        if(STR.equals("AzkarElsabah")){
            mAzkar = context.getResources().getStringArray(R.array.elsbah);
            mTitle.setText(R.string.elsabah);
        }else if(STR.equals("AzkarElmasaa")){
            mAzkar = context.getResources().getStringArray(R.array.elmsaa);
            mTitle.setText(R.string.elmasaa);
        }else if(STR.equals("AzkarElazan")){
            mAzkar = context.getResources().getStringArray(R.array.azan);
            mTitle.setText(R.string.elazan);
        }else if(STR.equals("AzkarElwdoa")){
            mAzkar = context.getResources().getStringArray(R.array.wdoa);
            mTitle.setText(R.string.elwdoo);
        }else if(STR.equals("AzkarElsalaa")){
            mAzkar = context.getResources().getStringArray(R.array.salaa);
            mTitle.setText(R.string.elsala);
        }else if(STR.equals("AzkarElfood")){
            mAzkar = context.getResources().getStringArray(R.array.food);
            mTitle.setText(R.string.elfood);
        }else if(STR.equals("AzkarElsleep")){
            mAzkar = context.getResources().getStringArray(R.array.sleep);
            mTitle.setText(R.string.elsleep);
        }
        mNumber.setText(i+"/10");
        mContent.setText(mAzkar[j]);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==10){
                    return;
                }
                mNumber.setText(++i+"/10");
                mContent.setText(mAzkar[++j]);
            }
        });
        mPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==1){
                    return;
                }
                mNumber.setText(--i+"/10");
                mContent.setText(mAzkar[--j]);
            }
        });
        mShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = mContent.getText().toString();
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "أذكار الصباح والمساء");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Azkar.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
