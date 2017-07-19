package com.example.my.messengerpractice;

import android.app.Dialog;
import android.view.View;

/**
 * Created by my on 2017-07-19.
 */

public class FriendsListDialogClickListener{
    View view;

    public FriendsListDialogClickListener(View v){
        this.view = v;
    }

    public void FriendsListClicked(){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(view.getContext());
                dialog.setContentView(R.layout.friends_list_clicked_dialog);
                dialog.show();
            }
        });
    }

}
