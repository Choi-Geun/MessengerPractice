package com.example.my.messengerpractice;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.my.messengerpractice.fragments.MainFragment;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MainFragment mainFragment = new MainFragment();
        fragmentTransaction.add(R.id.frame_main_layout, mainFragment, "main_fragment");
        fragmentTransaction.commit();
    }


//    public void setToolbarUI(int layoutResources){
//        stub.setLayoutResource(layoutResources);
//        stub.inflate();
//    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
//        switch(i){
//            case R.id.add_friends:
//                startActivity(new Intent(this, AddFriendsActivity.class));
//                break;
//            case R.id.search_friends:
//                startActivity(new Intent(this, ActivitySearchFriends.class));
//                break;
//        }
    }
}
