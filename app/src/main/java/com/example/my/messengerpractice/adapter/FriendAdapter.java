package com.example.my.messengerpractice.adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.my.messengerpractice.FriendsListDialogClickListener;
import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.model.Friend;
import com.example.my.messengerpractice.viewholder.ItemViewHolder;

import java.util.List;

/**
 * Created by my on 2017-07-19.
 */

public class FriendAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<Friend> mFreidns;
    Context context;

    public FriendAdapter(List<Friend> FriendsModel, Context c){
        mFreidns = FriendsModel;
        context = c;
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
        Friend friends = mFreidns.get(position);
        holder.name.setText(friends.getName());
        holder.statusMessage.setText(friends.getProfileMessage());

        new FriendsListDialogClickListener(holder.cardView).FriendsListClicked();

    }

    @Override
    public int getItemCount() {
        return mFreidns.size();
    }

}