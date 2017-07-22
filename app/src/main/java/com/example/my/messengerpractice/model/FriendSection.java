package com.example.my.messengerpractice.model;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by my on 2017-07-19.
 */

public class FriendSection{
    private String header;
    private List<Friend> friendList;
    private List<Friend> profileList;

    public String getHeader(){return header;}

    public List<Friend> getFriendList(){return friendList;}

    public List<Friend> getProfileList(){return profileList;}

    public List<FriendSection> getSectionData(){return SectionData();}

    private void setHeader(String header){this.header = header;}

    public void setProfileList(List<Friend> profileList){ this.profileList = profileList;}

    public void setFriendList(List<Friend> friendList){
        this.friendList = friendList;
    }

    private List<FriendSection> SectionData(){
        List<FriendSection> sectionList = new ArrayList<>();

        FriendSection Section = new FriendSection();
        Section.setHeader("프로필");
        sectionList.add(Section);

        FriendSection Section2 = new FriendSection();
        Section2.setHeader("추천 친구");
        sectionList.add(Section2);

        FriendSection Section3 = new FriendSection();
        Section3.setHeader("친구 목록");
        sectionList.add(Section3);

        return sectionList;
    }

}
