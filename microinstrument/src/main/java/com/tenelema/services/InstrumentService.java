package com.tenelema.services;

import java.util.List;

import com.tenelema.entities.Instrumento;

public interface InstrumentService {

    Instrumento save(Instrumento instrument);

    void delete(Instrumento instrument);

    Instrumento findById(String instrument);

    List<Instrumento> findAll();

}
