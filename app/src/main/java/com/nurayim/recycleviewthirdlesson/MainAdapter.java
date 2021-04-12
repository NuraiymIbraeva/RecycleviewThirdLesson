package com.nurayim.recycleviewthirdlesson;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

       ArrayList<Item_model> data = new ArrayList<Item_model>();



    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        //вызвали layout класса infalter взяли
        View view = inflater.inflate(R.layout.item_list,parent,false);
        return  new MainViewHolder(view);
        //
    }

     public  void  addText(ArrayList<Item_model>list){
        data = list;
        notifyDataSetChanged();


     }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.OnBind(data.get(position));

         // передает метод с их позициями в MainViewHolder когда пишем точку то он высвBечивает метод
        // onBind  и предаем туда нашу datu ,берем ее позицию

    }

    @Override
    public int getItemCount() {
        return data.size(); // он говорит вот наша data его размер общий размер берет
        //

    }
}
