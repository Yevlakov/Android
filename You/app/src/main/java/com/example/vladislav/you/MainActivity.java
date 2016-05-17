package com.example.vladislav.you;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;



public class MainActivity extends AppCompatActivity
{
    Intent myintent = new Intent();
    public void MyAppExit(View view)
    {
        this.finish();
    }

    public void GoProg(View v)

    {
        myintent.setClass(this, ProgrammerActivity.class);
        startActivity(myintent);
        finish();
    }
    public void GoDes(View v)

    {
        myintent.setClass(this, DesignerActivity.class);
        startActivity(myintent);
        finish();
    }

    public void GoLawyer(View v)

    {
        myintent.setClass(this, LawyerActivity.class);
        startActivity(myintent);
        finish();
    }

    public void GoWebDes(View v)

    {
        myintent.setClass(this, WebDesignerActivity.class);
        startActivity(myintent);
        finish();
    }
    public void GoArt(View v)

    {
        myintent.setClass(this, ArtistActivity.class);
        startActivity(myintent);
        finish();
    }
    public void GoMus(View v)

    {
        myintent.setClass(this, MusicianActivity.class);
        startActivity(myintent);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
