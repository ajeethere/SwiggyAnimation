package com.example.swiggyanimation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    List<Objects> data;
    Context context;

    public Adapter(List<Objects> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Objects objects=data.get(position);
        holder.bind(objects);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    void recyclerViewScrolled(RecyclerView recyclerView, int scrollAmount) {

        ViewHolder holder = null;

        int starPos = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        int lastPos = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();

        if (starPos <= lastPos) {
            while (true) {
                holder = (ViewHolder) recyclerView.findViewHolderForLayoutPosition(starPos);
                if (holder != null) {
                    holder.imageView.setRotation(holder.imageView.getRotation() + (float) scrollAmount);
                }
                if (starPos == lastPos) {
                    break;
                }
                ++starPos;
            }
        }
    }
}
