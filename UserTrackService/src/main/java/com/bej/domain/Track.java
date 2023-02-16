/*
 * Author : Ketki Keni
 * Date : 16-02-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.bej.domain;

import org.springframework.data.annotation.Id;

public class Track {
    @Id
    private String trackId;
    private String trackName;
    private String trackArtist;
    private int trackRating;

    public Track() {
    }

    public Track(String trackId, String trackName, String trackArtist, int trackRating) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackArtist = trackArtist;
        this.trackRating = trackRating;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    public int getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(int trackRating) {
        this.trackRating = trackRating;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackArtist='" + trackArtist + '\'' +
                ", trackRating=" + trackRating +
                '}';
    }
}
