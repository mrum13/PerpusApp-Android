package com.example.presentasikarya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class icon1_activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> listModel = new ArrayList<Model>();
    private LinearLayoutManager linearLayoutPembuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icon1_activity);

        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        listModel.addAll(Data.getListData());

        linearLayoutPembuat = new LinearLayoutManager(icon1_activity.this);

        recyclerView.setLayoutManager(linearLayoutPembuat);
        Adapter itemAdapter = new Adapter(listModel);
        recyclerView.setAdapter(itemAdapter);
    }
}
