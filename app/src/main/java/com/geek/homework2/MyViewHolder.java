package com.geek.homework2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView id,title,description,data;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.rv);
        title = itemView.findViewById(R.id.title);
        description = itemView.findViewById(R.id.description);
        data = itemView.findViewById(R.id.data);

    }

    public void onBind(Cell s) {
    id.setText(s.getId());
    title.setText(s.getTitle());
     description.setText(s.getDescription());
    data.setText(s.getData());
    }
}