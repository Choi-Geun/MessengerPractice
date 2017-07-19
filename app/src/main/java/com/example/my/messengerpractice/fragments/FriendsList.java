package com.example.my.messengerpractice.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.adapter.SectionAdapter;
import com.example.my.messengerpractice.model.Friend;
import com.example.my.messengerpractice.model.FriendSection;

import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by my on 2017-07-18.
 */

public class FriendsList extends Fragment {

    private RecyclerView mRecyclerView;
    private SectionedRecyclerViewAdapter sectionAdapter;
    public FriendsList(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recycler_view_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mRecyclerView = getActivity().findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        SectionAdapter sectionAdapter = new SectionAdapter(FriendsData(),SectionData());
        mRecyclerView.setAdapter(sectionAdapter);

    }

    public List<Friend> FriendsData(){
        List<Friend> friendsList = new ArrayList<>();
        friendsList.add(new Friend("이름 1", "상태 1", ""));
        friendsList.add(new Friend("이름 2", "상태 2", ""));
        friendsList.add(new Friend("이름 3", "상태 3", ""));
        friendsList.add(new Friend("이름 4", "상태 4", ""));

        return friendsList;
    }

    public List<FriendSection> SectionData(){
        List<FriendSection> SectionList = new ArrayList<>();
        SectionList.add(new FriendSection("프로필"));
        SectionList.add(new FriendSection("추천 친구"));
        SectionList.add(new FriendSection("친구"));
        return SectionList;
    }
}
