/*
 * Author : Ketki Keni
 * Date : 30-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.bej.service;

import com.bej.domain.Track;
import com.bej.domain.User;
import com.bej.exception.TrackAlreadyExistsException;
import com.bej.exception.TrackNotFoundException;
import com.bej.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrackServiceImpl implements TrackService{
    TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public User registerUser(User user)  {
        return trackRepository.save(user);
    }

    @Override
    public User saveTrack(Track track, String email) throws TrackAlreadyExistsException {
        User user = trackRepository.findByEmail(email);
        if(user.getTrackList() == null)
        {
            user.setTrackList(Arrays.asList(track));
        }
        else {
            List<Track> tracks = user.getTrackList();
            tracks.add(track);
            user.setTrackList(tracks);
        }
        return trackRepository.save(user);
    }

    @Override
    public User deleteTrack(String email, String trackId) throws TrackNotFoundException {
        boolean movieIdIsPresent = false;
        User user = trackRepository.findById(email).get();
        List<Track> tracks = user.getTrackList();
        movieIdIsPresent = tracks.removeIf(x->x.getTrackId().equals(trackId));
        tracks.get(0).getTrackName().equals(trackId);
        if(!movieIdIsPresent)
        {
            throw new TrackNotFoundException();
        }
        user.setTrackList(tracks);
        return trackRepository.save(user);
    }

    @Override
    public List<Track> getAllTracks(String email) {
        return trackRepository.findById(email).get().getTrackList();
    }


}
