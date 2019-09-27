package com.example.swiggyanimation;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    View view;
    ImageView imageView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        view=itemView;
    }

    public void bind(Objects objects) {
        TextView textView=view.findViewById(R.id.item_txt);
        textView.setText(objects.getTxt());

        imageView=view.findViewById(R.id.item_image);
    }
}
