package com.tenelema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tenelema.entities.Instrumento;

@Repository
public interface InstrumentDao extends JpaRepository<Instrumento, String>{

}
