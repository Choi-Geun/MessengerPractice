package com.example.my.messengerpractice;

import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DialogFragmentFriends extends DialogFragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_friends_clicked, container, false);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        switch(i){

        }
    }
}
