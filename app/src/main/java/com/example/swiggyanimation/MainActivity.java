package com.example.swiggyanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
List<Objects> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));
        data.add(new Objects("Ajeet"));


        final Adapter adapter=new Adapter(data,this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                adapter.recyclerViewScrolled(recyclerView, dy);
            }
        });
    }

}
