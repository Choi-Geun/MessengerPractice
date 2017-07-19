package com.example.my.messengerpractice.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.my.messengerpractice.R;

/**
 * Created by my on 2017-07-18.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView name, statusMessage;
    public ImageView profileimg;

    public ItemViewHolder(View itemView) {
        super(itemView);
        cardView = itemView.findViewById(R.id.cardview);
        name = itemView.findViewById(R.id.sample_title);
        statusMessage = itemView.findViewById(R.id.statusMessage);
        profileimg = itemView.findViewById(R.id.profile_image);
    }
}

