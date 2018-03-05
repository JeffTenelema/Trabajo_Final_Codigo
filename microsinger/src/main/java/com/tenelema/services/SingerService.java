package com.tenelema.services;

import java.util.List;

import com.tenelema.entities.Singer;

public interface SingerService {
	
    Singer save(Singer singer);

    void delete(Singer singer);

    Singer findById(Long id);

    List<Singer> findAll();

    List<Singer> findByInstrument(String instrument);

    List<String> findAllEmails();

}
