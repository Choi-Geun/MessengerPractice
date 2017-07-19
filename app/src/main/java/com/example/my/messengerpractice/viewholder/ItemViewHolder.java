package com.example.my.messengerpractice.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my.messengerpractice.R;

/**
 * Created by my on 2017-07-18.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public TextView name, statusMessage;
    public ImageView profileimg;

    public ItemViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.sample_title);
        statusMessage = itemView.findViewById(R.id.statusMessage);
        profileimg = itemView.findViewById(R.id.profile_image);
    }

}

