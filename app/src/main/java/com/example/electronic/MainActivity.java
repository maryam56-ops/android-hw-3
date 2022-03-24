package com.example.electronic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Items> itemlist = new ArrayList<>();

        Items football = new Items("Football", R.drawable.img);
        Items basketball = new Items("Basketball", R.drawable.img_1);
        Items karate = new Items("Karate", R.drawable.img_2);
        Items boxing = new Items("Boxing", R.drawable.img_3);
        Items tableball = new Items("Table ball", R.drawable.img_4);

        itemlist.add(football);
        itemlist.add(basketball);
        itemlist.add(karate);
        itemlist.add(boxing);
        itemlist.add(tableball);

        ItemsAdapter itemAdapter = new ItemsAdapter(this , 0 , itemlist);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemAdapter);

    }
}