package com.example.my.messengerpractice.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.my.messengerpractice.fragments.FriendsFragment;
import com.example.my.messengerpractice.fragments.MessageFragment;
import com.example.my.messengerpractice.fragments.OptionFragment;
import com.example.my.messengerpractice.fragments.TimelineFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by my on 2017-07-18.
 */

public class MainAdapter extends FragmentPagerAdapter {

    public MainAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new FriendsFragment();
            case 1:
                return new MessageFragment();
            case 2:
                return new TimelineFragment();
            case 3:
                return new OptionFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}
