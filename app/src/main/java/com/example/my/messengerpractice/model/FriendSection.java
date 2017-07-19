package com.example.my.messengerpractice.model;
import java.util.List;

/**
 * Created by my on 2017-07-19.
 */

public class FriendSection{
    public String header;
    public List<Friend> friendList;

    public FriendSection(String header){
        this.header = header;
    }

    public String getHeader(){return header;}

    public List<Friend> getFriendList(){return friendList;}

    public void setFriendList(List<Friend> friendList){
        this.friendList = friendList;
    }

}
