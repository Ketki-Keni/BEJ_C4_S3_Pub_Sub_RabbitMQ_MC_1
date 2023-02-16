package com.bej.repository;

import com.bej.domain.Track;
import com.bej.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TrackRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
