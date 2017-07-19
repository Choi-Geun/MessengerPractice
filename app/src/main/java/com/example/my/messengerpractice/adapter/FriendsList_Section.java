package com.example.my.messengerpractice.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.model.Friend;
import com.example.my.messengerpractice.viewholder.ItemViewHolder;
import com.example.my.messengerpractice.viewholder.SectionHeaderViewHolder;

import java.util.ArrayList;

import io.github.luizgrp.sectionedrecyclerviewadapter.StatelessSection;

/**
 * Created by my on 2017-07-18.
 */

public class FriendsList_Section extends StatelessSection {
    private String title;
    private ArrayList<Friend> friendsList;
    ItemViewHolder itemViewHolder;

    public FriendsList_Section(String title, ArrayList<Friend> friends) {
        super(R.layout.section_header, R.layout.item_view);
        this.title = title;
        this.friendsList = friends;
    }


    @Override
    public int getContentItemsTotal() {
        return friendsList.size();
    }

    @Override
    public RecyclerView.ViewHolder getItemViewHolder(View view) {
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
        itemViewHolder = (ItemViewHolder)holder;
        Friend friends = friendsList.get(position);
        itemViewHolder.name.setText(friends.getName());
        itemViewHolder.statusMessage.setText(friends.getProfileMessage());

    }
    @Override
    public RecyclerView.ViewHolder getHeaderViewHolder(View view) {
        return new SectionHeaderViewHolder(view);
    }
    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder) {
        SectionHeaderViewHolder headerViewHolder = (SectionHeaderViewHolder) holder;
        headerViewHolder.sectionHeader.setText(title);
    }
}