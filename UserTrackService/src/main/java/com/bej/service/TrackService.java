package com.bej.service;

import com.bej.domain.Track;
import com.bej.domain.User;
import com.bej.exception.TrackAlreadyExistsException;
import com.bej.exception.TrackNotFoundException;

import java.util.List;

public interface TrackService {
    User registerUser(User user);
    public User saveTrack(Track track, String email) throws TrackAlreadyExistsException;
    public User deleteTrack(String email, String trackId) throws TrackNotFoundException;
    public List<Track> getAllTracks(String email);
}
