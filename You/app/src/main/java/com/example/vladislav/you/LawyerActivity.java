package com.example.vladislav.you;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class LawyerActivity extends AppCompatActivity {

    CheckBox chb1,chb2,chb3,chb4,chb5,chb6,chb7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawyer);

        chb1 = (CheckBox) findViewById(R.id.checkBox);
        chb2 = (CheckBox) findViewById(R.id.checkBox2);
        chb3 = (CheckBox) findViewById(R.id.checkBox3);
        chb4 = (CheckBox) findViewById(R.id.checkBox4);
        chb5 = (CheckBox) findViewById(R.id.checkBox5);
        chb6 = (CheckBox) findViewById(R.id.checkBox6);
        chb7 = (CheckBox) findViewById(R.id.checkBox7);
    }

    public void GoHome(View view)
    {
        Intent intent=new Intent();
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void MyonCheckboxClicked(View view)
    {
        ((ImageView)findViewById(R.id.imageView)).setVisibility(View.VISIBLE);
        ImageView mImageView = (ImageView) findViewById(R.id.imageView);

        {
            if((chb5.isChecked()||chb6.isChecked()||chb7.isChecked())&&!chb1.isChecked()&&!chb2.isChecked()&&!chb3.isChecked()&&!chb4.isChecked())
            {
                mImageView.setImageDrawable(getResources().getDrawable(R.drawable.lawyer_no));
                Toast.makeText(this, "Вы всего лишь обычный юрист...", Toast.LENGTH_SHORT).show();
            }
            else
            {
                mImageView.setImageDrawable(getResources().getDrawable(R.drawable.lawyer_yes));
                Toast.makeText(this, "Поздравляю,вы - ТЫЖюрист!!!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    public void MyClearTest(View view)
    {

        ((CheckBox)findViewById(R.id.checkBox)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkBox2)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkBox3)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkBox4)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkBox5)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkBox6)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkBox7)).setChecked(false);
        ((ImageView)findViewById(R.id.imageView)).setVisibility(View.GONE);
    }
}
