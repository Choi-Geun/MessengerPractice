package com.example.my.messengerpractice.model;

/**
 * Created by my on 2017-07-18.
 */

public class Friend {

    private String name;
    private String photoURL;
    private String statusMessage;

    public Friend(String name, String ProfileMessage, String PhotoURL){
        this.name = name;
        this.photoURL = PhotoURL;
        this.statusMessage = ProfileMessage;

    }

    public String getName(){return name;}

    public String getPhotoURL(){return photoURL;}

    public String getProfileMessage(){return statusMessage;}

}
