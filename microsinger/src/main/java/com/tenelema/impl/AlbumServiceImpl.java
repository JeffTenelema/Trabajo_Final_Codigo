package com.tenelema.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenelema.dao.AlbumDao;
import com.tenelema.entities.Album;
import com.tenelema.services.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService{
    
	@Autowired
    private AlbumDao albumDao;

    @Override
    public Album findById(Long id) {
        return albumDao.findOne(id);
    }

    @Override
    public Iterable<Album> findAlbumBySingerId(Long id) {
        return albumDao.findAlbumBySingerId(id);
    }

    @Override
    public List<Album> findAll() {
        return albumDao.findAll();
    }

    @Override
    public Album save(Album a) {
        return albumDao.save(a);
    }

    @Override
    public void delete(Album a) {
        albumDao.delete(a);
    }

}
