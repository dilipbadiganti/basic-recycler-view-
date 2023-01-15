package com.example.recyclerfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_ForSample extends RecyclerView.Adapter<Adapter_ForSample.MyViewHolder>{

    Context context;
    ArrayList<SampleModel> sampleModels;
    public Adapter_ForSample(Context context, ArrayList<SampleModel> sampleModels){
        this.context = context;
        this.sampleModels = sampleModels;
    }


    @NonNull
    @Override
    public Adapter_ForSample.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_the_base,parent, false);

        return new Adapter_ForSample.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_ForSample.MyViewHolder holder, int position) {

        holder.bigText.setText(sampleModels.get(position).getBigName());
        holder.smallText.setText(sampleModels.get(position).getSmallName());
        holder.imageView.setImageResource(sampleModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return sampleModels.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView bigText;
        TextView smallText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            bigText = itemView.findViewById(R.id.textView);
            smallText = itemView.findViewById(R.id.textView2);
        }
    }


}
