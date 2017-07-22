package com.example.my.messengerpractice.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.model.Friend;
import com.example.my.messengerpractice.model.FriendSection;
import com.example.my.messengerpractice.viewholder.UserViewHolder;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private List<Friend> friendsData;

    public FriendAdapter(List<Friend> friends){
        friendsData = friends;
    }
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View FriendsView = inflater.inflate(R.layout.item_view, parent,false);

        return new UserViewHolder(FriendsView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

        holder.name.setText(friendsData.get(position).getName());
        holder.statusMessage.setText(friendsData.get(position).getStatusMessage());

    }

    @Override
    public int getItemCount() {
        return friendsData.size();
    }


}