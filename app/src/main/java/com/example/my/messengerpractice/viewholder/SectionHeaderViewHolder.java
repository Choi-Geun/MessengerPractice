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



public class SectionHeaderViewHolder extends RecyclerView.ViewHolder{
    public TextView sectionHeader;
    private List<Friend> friendList;
    private List<Friend> profileList;
    private RecyclerView sectionRecyclerView;

    public SectionHeaderViewHolder(View itemView) {
        super(itemView);
        friendList = new ArrayList<>();
        sectionHeader = itemView.findViewById(R.id.header);
        sectionRecyclerView = itemView.findViewById(R.id.section_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(itemView.getContext());
        sectionRecyclerView.setLayoutManager(linearLayoutManager);
    }

    public void onBind(FriendSection sections){
        sections.setFriendList(new Friend().getFriendsData());
        sections.setProfileList(new Friend().getProfileData());
        friendList = sections.getFriendList();
        profileList = sections.getProfileList();
        FriendAdapter friendAdapter;

        if(sections.getHeader().equals("프로필")){
            friendAdapter = new FriendAdapter(profileList);
            sectionRecyclerView.setAdapter(friendAdapter);
            sectionRecyclerView.setHasFixedSize(true);
            sectionHeader.setText(sections.getHeader());
        }else{
            friendAdapter = new FriendAdapter(friendList);
            sectionRecyclerView.setAdapter(friendAdapter);
            sectionRecyclerView.setHasFixedSize(true);
            sectionHeader.setText(sections.getHeader());
        }

    }
}