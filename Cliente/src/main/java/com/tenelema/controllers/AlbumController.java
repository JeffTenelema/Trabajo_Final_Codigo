package com.tenelema.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.tenelema.entities.Album;

@Controller
@RequestMapping(value="/album")
public class AlbumController {
	
    RestTemplate restTemplate;

    private static final String URL_GET_ALL_ALBUMS = "http://localhost:8000/api/album/";

    @PostConstruct
    public void setUp(){
        restTemplate = new RestTemplate();
    }

    @RequestMapping("/index")
    public String findAllSingers(Model model) {
        List<Album> albums = restTemplate.getForObject(URL_GET_ALL_ALBUMS + "list", List.class);
        model.addAttribute("albums", albums);
        return "album/index";
    }

}
