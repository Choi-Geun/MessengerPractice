package com.example.my.messengerpractice.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.model.Friend;
import com.example.my.messengerpractice.model.FriendSection;
import com.example.my.messengerpractice.viewholder.SectionHeaderViewHolder;

import java.util.List;

/**
 * Created by my on 2017-07-19.
 */

public class SectionAdapter extends RecyclerView.Adapter<SectionHeaderViewHolder> {

    private List<FriendSection> mSections;
    private List<Friend> mFriends;

    public SectionAdapter(List<Friend> mFriends,List<FriendSection> mSections){
        this.mSections = mSections;
        this.mFriends = mFriends;
    }

    @Override
    public SectionHeaderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View SectionView = inflater.inflate(R.layout.section_header, parent,false);
        SectionHeaderViewHolder sectionHeaderViewHolder = new SectionHeaderViewHolder(SectionView);

        return sectionHeaderViewHolder;
    }

    @Override
    public void onBindViewHolder(SectionHeaderViewHolder holder, int position) {
        FriendSection friendSection = mSections.get(position);
        friendSection.setFriendList(mFriends);
        holder.onBind(friendSection);
        holder.sectionHeader.setText(friendSection.getHeader());
    }
    @Override
    public int getItemCount() {
        return mSections.size();
    }
}
