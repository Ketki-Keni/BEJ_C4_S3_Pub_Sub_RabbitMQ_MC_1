/*
 * Author : Ketki Keni
 * Date : 16-02-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.bej.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

public class User {
    @Id
    private String email;
    private String userName;
    private String password;
    private String phoneNumber;
    private List<Track> trackList;

    public User() {
    }

    public User(String email, String userName, String password, String phoneNumber, List<Track> trackList) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.trackList = trackList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", trackList=" + trackList +
                '}';
    }
}
