package com.tenelema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tenelema.entities.Album;
import com.tenelema.services.AlbumService;

@RestController
@RequestMapping(value="/album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/list")
    public Iterable<Album> list(){
        return albumService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/")
    public Album save(@RequestBody Album album){
        return albumService.save(album);
    }

    @PutMapping(value = "/{id}")
    public Album update(@RequestBody Album album, @PathVariable Long id){
        album.setId(id);
        return albumService.save(album);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@RequestBody Long id){
        Album album=albumService.findById(id);
        albumService.delete(album);
    }

    @GetMapping(value = "/singer/{id}")
    public Iterable<Album> albumSinger(@RequestBody Long id){
        return albumService.findAlbumBySingerId(id);
    }

}
