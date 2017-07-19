package com.example.my.messengerpractice.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.model.Friend;
import com.example.my.messengerpractice.viewholder.ItemViewHolder;

import java.util.ArrayList;

/**
 * Created by my on 2017-07-18.
 */

public class RecyclerView_Adapter extends RecyclerView.Adapter<ItemViewHolder> {

    private ArrayList<Friend> mFreidnsModel;

    public RecyclerView_Adapter(ArrayList<Friend> FriendsModel){
        mFreidnsModel = FriendsModel;
    }
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View FriendsView = inflater.inflate(R.layout.item_view, parent,false);

        ItemViewHolder itemViewHolder = new ItemViewHolder(FriendsView);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Friend friends = mFreidnsModel.get(position);
        holder.name.setText(friends.getName());
        holder.statusMessage.setText(friends.getProfileMessage());
    }

    @Override
    public int getItemCount() {
        return mFreidnsModel.size();
    }


}
