package com.bej.service;

import com.bej.config.TrackDTO;
import com.bej.domain.Notification;
import com.bej.repository.NotificationRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NotificationServiceImpl implements NotificationService {
    private NotificationRepository notificationRepository;

    @Autowired
    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification getNotification(String email) {
        return notificationRepository.findById(email).get();
    }

    @RabbitListener(queues = "track-queue")
    @Override
    public void saveNotifications(TrackDTO trackDTO) {
        Notification notification=new Notification();
        String email= trackDTO.getJsonObject().get("email").toString();
        if(notificationRepository.findById(email).isEmpty())
        {
            notification.setEmail(email);
        }
        notification.setNotificationMessage("The list of Tracks that are not yet listened to");
        notification.setTrackNames(trackDTO.getJsonObject());
        notificationRepository.save(notification);
    }
}

