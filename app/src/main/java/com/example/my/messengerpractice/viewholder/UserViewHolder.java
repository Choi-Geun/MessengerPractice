package com.example.my.messengerpractice.viewholder;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my.messengerpractice.DialogFragmentFriends;
import com.example.my.messengerpractice.GlideApp;
import com.example.my.messengerpractice.R;

public class UserViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
    private CardView cardView;
    public TextView name, statusMessage;
    private ImageView profileimg;

    public UserViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        cardView = itemView.findViewById(R.id.cardview);
        name = itemView.findViewById(R.id.sample_title);
        statusMessage = itemView.findViewById(R.id.statusMessage);
        profileimg = itemView.findViewById(R.id.profile_image);

        GlideApp.with(itemView.getContext())
                .load(R.drawable.background)
                .fitCenter()
                .into(profileimg);

    }

    @Override
    public void onClick(View view){

        if(name.getText().equals("최근")){
            FragmentManager fragmentManager = ((AppCompatActivity) view.getContext()).getSupportFragmentManager();
            DialogFragmentFriends dialog = new DialogFragmentFriends();
            dialog.show(fragmentManager, "profile_view");
        }else{
            FragmentManager fragmentManager = ((AppCompatActivity) view.getContext()).getSupportFragmentManager();
            DialogFragmentFriends dialog = new DialogFragmentFriends();
            dialog.show(fragmentManager, "friend_view");
        }
    }

}

