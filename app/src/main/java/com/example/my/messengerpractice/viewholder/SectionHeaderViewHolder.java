package com.example.my.messengerpractice.viewholder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.adapter.FriendAdapter;
import com.example.my.messengerpractice.model.Friend;
import com.example.my.messengerpractice.model.FriendSection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by my on 2017-07-18.
 */

public class SectionHeaderViewHolder extends RecyclerView.ViewHolder{
    public TextView sectionHeader;
    public List<Friend> friendList;
    private RecyclerView sectinoRecyclerView;

    public SectionHeaderViewHolder(View itemView) {
        super(itemView);
        friendList = new ArrayList<>();
        sectionHeader = itemView.findViewById(R.id.header_id);
        sectinoRecyclerView = itemView.findViewById(R.id.section_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(itemView.getContext());
        sectinoRecyclerView.setLayoutManager(linearLayoutManager);
    }

    public void onBind(FriendSection section){
        friendList = section.friendList;
        FriendAdapter friendAdapter = new FriendAdapter(friendList,itemView.getContext());
        sectinoRecyclerView.setAdapter(friendAdapter);
        sectinoRecyclerView.setHasFixedSize(true);

    }
}