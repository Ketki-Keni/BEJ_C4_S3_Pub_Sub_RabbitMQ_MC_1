/*
 * Author : Ketki Keni
 * Date : 30-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.bej.controller;

import com.bej.domain.Track;
import com.bej.domain.User;
import com.bej.exception.TrackAlreadyExistsException;
import com.bej.exception.TrackNotFoundException;
import com.bej.service.TrackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class TrackController {
    TrackServiceImpl trackService;

    @Autowired
    public TrackController(TrackServiceImpl trackService) {
        this.trackService = trackService;
    }

    //Uri : http://localhost:8083/api/v2/register : Method : Post
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
            return new ResponseEntity<>(trackService.registerUser(user), HttpStatus.CREATED);
    }

    //Uri : http://localhost:8083/api/v2/user/ben@gmail.com/track: Method : Post
    @PostMapping("/user/{email}/track")
    public ResponseEntity<?> addTrack(@RequestBody Track track,@PathVariable String email) throws TrackAlreadyExistsException {

            return new ResponseEntity<>(trackService.saveTrack(track, email), HttpStatus.CREATED);
    }

    //Uri : http://localhost:8083/api/v2/user/ben@gmail.com/tracks: Method : Get

    @GetMapping("/user/{email}/tracks")
    public ResponseEntity<?> getAllTracks(@PathVariable String email){

        return new ResponseEntity<>(trackService.getAllTracks(email), HttpStatus.OK);
    }

    //Uri : http://localhost:8083/api/v2/user/ben@gmail.com/track/3 : Method : Delete
    @DeleteMapping("/user/{email}/track/{trackId}")
    public ResponseEntity<?> deleteTrack(@PathVariable String email, @PathVariable String trackId) throws TrackNotFoundException {

        return new ResponseEntity<>(trackService.deleteTrack(email, trackId), HttpStatus.OK);
    }
}
