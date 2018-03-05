package com.tenelema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tenelema.entities.Instrumento;
import com.tenelema.message.ProducerConfig;
import com.tenelema.services.InstrumentService;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value="/instrument")
public class InstrumentController {

    @Autowired
    private InstrumentService instrumentService;

    @Autowired
    private ProducerConfig producerConfig;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/list")
    public List<Instrumento> list(){
        return instrumentService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/")
    public Instrumento create(@RequestBody Instrumento instrument){
        Instrumento instrumentSave=instrumentService.save(instrument);
        producerConfig.sendMessage(instrumentSave);
        return instrumentSave;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable String id){
        Instrumento instrument=instrumentService.findById(id);
        instrumentService.delete(instrument);
    }

}
