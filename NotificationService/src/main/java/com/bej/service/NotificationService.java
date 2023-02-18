package com.bej.service;


import com.bej.config.TrackDTO;
import com.bej.domain.Notification;


public interface NotificationService {
    public Notification getNotification(String Id);
    void saveNotifications(TrackDTO trackDTO);
}



