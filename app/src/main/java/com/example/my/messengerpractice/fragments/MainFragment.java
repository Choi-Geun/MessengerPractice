package com.example.my.messengerpractice.fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import com.example.my.messengerpractice.ActivitySearchFriends;
import com.example.my.messengerpractice.AddFriendsActivity;
import com.example.my.messengerpractice.R;
import com.example.my.messengerpractice.adapter.MainAdapter;

public class MainFragment extends Fragment {

    private FragmentActivity context;

    @Override
    public void onAttach(Context context) {
        this.context = (FragmentActivity)context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Toolbar toolbar = view.findViewById(R.id.toolbar);


        ViewPager viewPager = view.findViewById(R.id.main_viewpager);
        MainAdapter adapter = new MainAdapter(context.getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tab = view.findViewById(R.id.main_tab);
        tab.setTabGravity(TabLayout.GRAVITY_FILL);

        tab.setupWithViewPager(viewPager);

        tab.getTabAt(0).setIcon(R.drawable.friendslist_tab);
        tab.getTabAt(1).setIcon(R.drawable.message_tab);
        tab.getTabAt(2).setIcon(R.drawable.timeline_tab);
        tab.getTabAt(3).setIcon(R.drawable.option_tab);

        toolbar.getMenu().clear();
        toolbar.setTitle("친구");
        toolbar.inflateMenu(R.menu.friends_list_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch(item.getItemId()){
                    case R.id.friendsTab_add_friends:
                        startActivity(new Intent(getActivity(), AddFriendsActivity.class));
                        break;
                    case R.id.friendsTab_search_friends:
                        startActivity(new Intent(getActivity(), ActivitySearchFriends.class));
                }
                return false;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position ==0){
                    toolbar.getMenu().clear();
                    toolbar.setTitle("친구");
                    toolbar.inflateMenu(R.menu.friends_list_menu);
                    toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch(item.getItemId()){
                                case R.id.friendsTab_add_friends:
                                    startActivity(new Intent(getActivity(), AddFriendsActivity.class));
                                    break;
                                case R.id.friendsTab_search_friends:
                                    startActivity(new Intent(getActivity(), ActivitySearchFriends.class));
                            }
                            return false;
                        }
                    });
                }else if(position ==1){
                    toolbar.getMenu().clear();
                    toolbar.inflateMenu(R.menu.message_list_menu);
                }else if(position == 2){
                    toolbar.getMenu().clear();

                }else if(position == 3){
                    toolbar.getMenu().clear();

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
