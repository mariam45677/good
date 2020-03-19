package com.examble.HAPPYBIRHHDAY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class numberActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);




        ArrayList<String> Word =new ArrayList<String>();
        Word.add("one");
        Word.add("two");
        Word.add("three");
        Word.add("four");
        Word.add("five");
        Word.add("six");
        Word.add("seven");
        Word.add("eight");
        Word.add("nine");
        Word.add("Ten");
        Word.add("mariamessa");
        Word.add("mahamedessa");
        Word.add("nmdvnfjvnfjk");
        Word.add("cdnmdjncijedh");
        Word.add("xncsjdewyeuiwh");
        Word.add("Welcome every body");

        ArrayAdapter<String> items = new ArrayAdapter<String>(this,0,Word);
        ListView List = (ListView) findViewById(R.id.List);
         List.setAdapter(items);



    }}







