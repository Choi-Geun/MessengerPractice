package com.example.my.messengerpractice.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by my on 2017-07-18.
 */

public class Friend {

    private String name;
    private String photoURL;
    private String statusMessage;

    public String getName(){return name;}

    public String getPhotoURL(){return photoURL;}

    public String getStatusMessage(){return statusMessage;}

    public List<Friend> getFriendsData(){return friendsData();}

    public List<Friend> getProfileData(){return profileData();}

    public void setName(String name){this.name = name;}

    public void setPhotoURL(String photoURL){this.photoURL = photoURL;}

    public void setStatusMessage(String statusMessage){this. statusMessage = statusMessage;}


    private List<Friend> friendsData(){
        List<Friend> friendsList = new ArrayList<>();

        for(int i =0; i<5; i++){
            Friend friend1 = new Friend();
            friend1.setName("name"+i);
            friend1.setPhotoURL("");
            friend1.setStatusMessage("status"+i);
            friendsList.add(friend1);

        }

        return friendsList;
    }

    private List<Friend> profileData(){
        List<Friend> profileList = new ArrayList<>();

        Friend profile = new Friend();
        profile.setName("최근");
        profile.setPhotoURL("");
        profile.setStatusMessage("공부중...");

        profileList.add(profile);

        return profileList;
    }


}
