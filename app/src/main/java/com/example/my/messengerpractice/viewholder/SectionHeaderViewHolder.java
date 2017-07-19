package com.example.my.messengerpractice.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.my.messengerpractice.R;

/**
 * Created by my on 2017-07-18.
 */

public class SectionHeaderViewHolder extends RecyclerView.ViewHolder{
    public TextView sectionHeader;

    public SectionHeaderViewHolder(View itemView) {
        super(itemView);
        sectionHeader = itemView.findViewById(R.id.header_id);
    }
}