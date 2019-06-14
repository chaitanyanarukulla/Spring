package com.chaiLab11.songr;

import org.springframework.data.repository.CrudRepository;

// sets up how Spring will interact with the database to retrieve/save/etc Albums
public interface SongRepository extends CrudRepository<Song, Long> {

}