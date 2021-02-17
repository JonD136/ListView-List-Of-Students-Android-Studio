package com.example.homework4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class second_page extends AppCompatActivity {

    int studentimageindexArray[] = {R.drawable.anthony_jayson, R.drawable.john_smith, R.drawable.kate_kahn,
                                     R.drawable.tanya_stevens, R.drawable.rita_vasquez, R.drawable.richard_hamslah,
                                        R.drawable.raymond_perez, R.drawable.peter_chow, R.drawable.mary_ash,
                                            R.drawable.lisa_chen};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        //defining the objects (ImageView, TextView)
        ImageView sImage = (ImageView) findViewById(R.id.studentImage);
        TextView sName = (TextView) findViewById(R.id.studentName);

        //creating an intent to get the passing variables
        Intent getVars = getIntent();

        //now we can get the variables (name,index)
        String name = getVars.getExtras().getString("nameKey");
        int index = getVars.getExtras().getInt("indexKey");


        //placing the corresponding image in the imageView sImage
        sImage.setImageResource(studentimageindexArray[index]);
        sName.setText(name);





    }
}
