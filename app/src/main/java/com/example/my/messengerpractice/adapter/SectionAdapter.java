package com.example.my.messengerpractice.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.model.FriendSection;
import com.example.my.messengerpractice.viewholder.SectionHeaderViewHolder;

import java.util.List;


public class SectionAdapter extends RecyclerView.Adapter<SectionHeaderViewHolder> {
    private FriendSection friendSection;
    List<FriendSection> friendSectionsData;

    public SectionAdapter(FriendSection sectionData) {
        this.friendSection = sectionData;
    }

    @Override
    public SectionHeaderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View SectionView = inflater.inflate(R.layout.section_header_recyclerview, parent,false);
        return new SectionHeaderViewHolder(SectionView);
    }

    @Override
    public void onBindViewHolder(SectionHeaderViewHolder holder, int position) {

        holder.onBind(friendSection.getSectionData().get(position));
        holder.sectionHeader.setText(friendSection.getSectionData().get(position).getHeader());
    }

    @Override
    public int getItemCount() {
            return friendSection.getSectionData().size();
    }
}
