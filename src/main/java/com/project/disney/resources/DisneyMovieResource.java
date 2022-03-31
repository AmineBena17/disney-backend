package com.project.disney.resources;

import com.project.disney.entities.DisneyMovieEntity;
import com.project.disney.services.DisneyMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DisneyMovieResource {

    private DisneyMovieService disneyMovieService;

   public DisneyMovieResource(DisneyMovieService disneyMovieService) {
        this.disneyMovieService = disneyMovieService;
    }

    @GetMapping("/movies/all")
    Iterable<DisneyMovieEntity> all() {
        return disneyMovieService.getAllMovies();
    }
}
