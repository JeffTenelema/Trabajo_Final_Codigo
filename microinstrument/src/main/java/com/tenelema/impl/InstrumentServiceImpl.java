package com.tenelema.impl;

import org.springframework.stereotype.Service;

import com.tenelema.dao.InstrumentDao;
import com.tenelema.entities.Instrumento;
import com.tenelema.services.InstrumentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class InstrumentServiceImpl implements InstrumentService {
	
    @Autowired
    private InstrumentDao instrumentDao;

    @Override
    public Instrumento save(Instrumento instrument) {
        return instrumentDao.save(instrument);
    }

    @Override
    public void delete(Instrumento instrument) {
        instrumentDao.delete(instrument);
    }

    @Override
    public Instrumento findById(String instrument) {
        return instrumentDao.findOne(instrument);
    }

    @Override
    public List<Instrumento> findAll() {
        return instrumentDao.findAll();
    }

}
