package com.nurayim.recycleviewthirdlesson;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView tv;





    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.tv_name);
    }
    public void OnBind(Item_model data){
        tv.setText(data.name);






    }




}
