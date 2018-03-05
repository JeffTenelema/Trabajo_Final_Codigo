package com.tenelema.services;

import java.util.List;

import com.tenelema.entities.Album;

public interface AlbumService {

    Album findById(Long id);

    Iterable<Album> findAlbumBySingerId(Long id);

    List<Album> findAll();

    Album save(Album a);

    void delete(Album a);

}
