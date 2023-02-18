/*
 * Author : Ketki Keni
 * Date : 17-02-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.bej.domain;

import org.json.simple.JSONObject;
import org.springframework.data.annotation.Id;

public class Notification {
    @Id
    private String email;
    private String notificationMessage;
    JSONObject trackNames;


    public Notification() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public JSONObject getTrackNames() {
        return trackNames;
    }

    public void setTrackNames(JSONObject trackNames) {
        this.trackNames = trackNames;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Notification{" +
                "email='" + email + '\'' +
                ", notificationMessage='" + notificationMessage + '\'' +
                ", trackNames=" + trackNames +
                '}';
    }
}
