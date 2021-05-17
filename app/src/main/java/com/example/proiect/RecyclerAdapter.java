package com.example.proiect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<Description> descriptionsList;
    private RecycleViewClickListener listener;

    public RecyclerAdapter(ArrayList<Description> descriptionsList, RecycleViewClickListener listener){
        this.descriptionsList = descriptionsList;
        this.listener = listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nameTxt;

        public MyViewHolder(final View view){
            super(view);
            nameTxt = view.findViewById(R.id.textView5);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            listener.onClick(view, getAdapterPosition());
        }
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        String name = descriptionsList.get(position).getTitlu();
        holder.nameTxt.setText(name);

    }

    @Override
    public int getItemCount() {
        return descriptionsList.size();
    }
    public interface RecycleViewClickListener{
        void onClick(View v, int position);
    }
}
