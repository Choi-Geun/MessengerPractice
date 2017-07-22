package com.example.my.messengerpractice.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.my.messengerpractice.ActivitySearchFriends;
import com.example.my.messengerpractice.AddFriendsActivity;
import com.example.my.messengerpractice.MainActivity;
import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.adapter.SectionAdapter;
import com.example.my.messengerpractice.model.Friend;
import com.example.my.messengerpractice.model.FriendSection;

import java.util.ArrayList;
import java.util.List;

public class FriendsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_friends_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RecyclerView mRecyclerView = getActivity().findViewById(R.id.recyclerView_friend_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        //현재 친구목록 프레그먼트에 들어갈 데이터 설정, 이부분을 나중에 앱 처음 시작할때 실행해도 될듯
        FriendSection sectionData = new FriendSection();

        SectionAdapter sectionAdapter = new SectionAdapter(sectionData);
        mRecyclerView.setAdapter(sectionAdapter);


    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.friends_list_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.friendsTab_add_friends:
                startActivity(new Intent(this.getActivity(), AddFriendsActivity.class));
                break;
            case R.id.friendsTab_search_friends:
                startActivity(new Intent(this.getActivity(), ActivitySearchFriends.class));

        }
        return super.onOptionsItemSelected(item);

    }
}
