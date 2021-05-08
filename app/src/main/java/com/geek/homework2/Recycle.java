package com.geek.homework2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Recycle extends AppCompatActivity {
    RecyclerView recycle;
    Adapter adapter;
    ArrayList<Cell>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add(new Cell("1","Заголовок","Описание","08.05.2021"));
        list.add(new Cell("2","Заголовок","Описание","08.05.2021"));
        list.add(new Cell("3","Заголовок","Описание","08.05.2021"));
        list.add(new Cell("4","Заголовок","Описание","08.05.2021"));
        list.add(new Cell("5","Заголовок","The Hils","08.05.2021"));
        list.add(new Cell("6","Заголовок","Описание","08.05.2021"));
        list.add(new Cell("7","Заголовок","Описание","08.05.2021"));
        list.add(new Cell("8","Заголовок","Описание","08.05.2021"));
        list.add(new Cell("9","Заголовок","Описание","08.05.2021"));
        list.add(new Cell("10","Заголовок","Описание","08.05.2021"));
       inRecycler();

    }
    private void inRecycler() {
        recycle = findViewById(R.id.recycler);
        adapter = new Adapter();
        recycle.setAdapter(adapter);
        adapter.setData(list);
    }
}