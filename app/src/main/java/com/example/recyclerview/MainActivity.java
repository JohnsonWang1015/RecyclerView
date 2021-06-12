package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    //private RecyclerView.Adapter<TextAdapter.ViewHolder> adapter;
    private RecyclerView.Adapter<ImageAdapter.ViewHolder> adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        //TextAdapter
        //String[] data = getResources().getStringArray(R.array.countries);
        //adapter = new TextAdapter(context, data);

        adapter = new ImageAdapter(context); //ImageAdapter
        recyclerView.setAdapter(adapter);
    }
}