package com.nurayim.recycleviewthirdlesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recycler;
    MainAdapter adapter;
    ArrayList<Item_model> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.rv);
        adapter = new MainAdapter();

        recycler.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);


        recycler.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(0,new Item_model("Messi"));
        list.add(0,new Item_model("Ronaldo"));
        list.add(0,new Item_model("Di Caprio"));
        list.add(0,new Item_model("Beluchi"));
        list.add(0,new Item_model("Hulk"));
        list.add(0,new Item_model("Spider Man"));
        list.add(0,new Item_model("sinderella"));
        list.add(0,new Item_model("Messi and Ronaldo"));

        adapter.addText(list);



    }
}