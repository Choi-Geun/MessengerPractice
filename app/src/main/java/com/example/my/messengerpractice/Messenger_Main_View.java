package com.example.my.messengerpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.my.messengerpractice.fragments.FriendsList;
import com.example.my.messengerpractice.fragments.MessageList;
import com.example.my.messengerpractice.fragments.OptionList;
import com.example.my.messengerpractice.fragments.TimelineList;

/**
 * Created by my on 2017-07-15.
 */

public class Messenger_Main_View extends AppCompatActivity implements View.OnClickListener{

    private PagerAdapter mPagerAdapter;
    private ViewPager mViewPager;
    private ImageButton add_friends_btn, search_friends_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messenger_main_view);

        Toolbar mToolbar = findViewById(R.id.toolbar);
        add_friends_btn = findViewById(R.id.add_friends);
        search_friends_btn = findViewById(R.id.search_friends);

        add_friends_btn.setOnClickListener(this);
        search_friends_btn.setOnClickListener(this);
        setSupportActionBar(mToolbar);

        mViewPager = findViewById(R.id.container);
        addFragmentsToViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        int[] mDrawable = {
                R.drawable.friendslist_tab,
                R.drawable.message_tab,
                R.drawable.timeline_tab,
                R.drawable.option_tab
        };

        for(int i=0; i<tabLayout.getTabCount(); i++){
            tabLayout.getTabAt(i).setIcon(mDrawable[i]);
        }

    }

    private void addFragmentsToViewPager(ViewPager viewPager) {
        TabsFragmentsPagerAdapter adapter = new TabsFragmentsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FriendsList());
        adapter.addFragment(new MessageList());
        adapter.addFragment(new TimelineList());
        adapter.addFragment(new OptionList());

        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.friends_list_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();

        if (i == R.id.edit_friends) {

            return true;
        }else if(i == R.id.setting) {

            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        switch(i){
            case R.id.add_friends:
                startActivity(new Intent(this, Add_Friends_View.class));
                break;
            case R.id.search_friends:
                startActivity(new Intent(this, Search_Friends_View.class));
                break;
        }
    }
}
