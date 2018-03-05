package com.tenelema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.tenelema.entities.Instrumento;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/instrument")
public class InstrumentController {

    RestTemplate restTemplate;

    private static final String URL_GET_ALL_INSTRUMENTS = "http://localhost:8000/api/instrument/";

    @PostConstruct
    public void setUp(){
        restTemplate = new RestTemplate();
    }

    @RequestMapping("/index")
    public String findAllSingers(Model model){
        List<Instrumento> instruments = restTemplate.getForObject(URL_GET_ALL_INSTRUMENTS+"list", List.class);
        model.addAttribute("instrumentos", instruments);
        model.addAttribute("newInstrument",new Instrumento());
        return "instrument/index";
    }

    @PostMapping("/save")
    public String singerSubmit(@Valid Instrumento instrument, BindingResult bindingResult, Model model) {
        System.out.println("Entra al método");
        restTemplate.postForEntity(URL_GET_ALL_INSTRUMENTS+"/",instrument,Instrumento.class);
        return "index";
    }

}
