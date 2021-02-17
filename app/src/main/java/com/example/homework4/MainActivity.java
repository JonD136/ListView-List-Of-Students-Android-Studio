package com.example.homework4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView sList;

    String nameArray[] = {"Anthony Jayson", "John Smith", "Kate Kahn",
                            "Tanya Stevens", "Rita Vasquez", "Richard Hamslah",
                                "Raymond Perez", "Peter Chow", "Mary Ash", "Lisa Chen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define global objects

        sList = (ListView) findViewById(R.id.studentList);

        //define Array Adapter
        ArrayAdapter<String> pressAA = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,nameArray);

        //set the adapter to the ListView
        sList.setAdapter(pressAA);


        //setting up listener to LV
        sList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //which student the user clicked
                String selectStudent = nameArray[position];

                //create an Intent and attach the vars
                Intent gotoScreen2 = new Intent(MainActivity.this, second_page.class);

                gotoScreen2.putExtra("nameKey", selectStudent);
                gotoScreen2.putExtra("indexKey", position);

                startActivity(gotoScreen2);



            }
        });




    }
}
