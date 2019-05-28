package com.stackroute.muzixapplication.respository;

import com.stackroute.muzixapplication.domain.Album;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface MuzixRepository extends JpaRepository<Album,Integer> {

    @Query(value = "select * from album where trackname = ?1", nativeQuery = true)
    public List<Album> getByName(String trackName);
}
