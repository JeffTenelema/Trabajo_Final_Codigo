package com.tenelema.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenelema.dao.SingerDao;
import com.tenelema.entities.Singer;
import com.tenelema.services.SingerService;

@Service
public class SingerServiceImpl implements SingerService{

    @Autowired
    private SingerDao singerDao;

    @Override
    public Singer save(Singer singer) {
        return singerDao.save(singer);
    }

    @Override
    public void delete(Singer singer) {
        singerDao.delete(singer);
    }

    @Override
    public Singer findById(Long id) {
        return singerDao.findOne(id);
    }

    @Override
    public List<Singer> findAll() {
        return singerDao.findAll();
    }

    @Override
    public List<Singer> findByInstrument(String instrument) {
        return singerDao.findByInstrumentId(instrument);
    }

    @Override
    public List<String> findAllEmails() {
        return singerDao.findAllEmails();
    }

}
