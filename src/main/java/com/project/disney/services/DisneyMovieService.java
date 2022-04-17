package com.project.disney.services;

import com.project.disney.entities.DisneyMovieEntity;
import com.project.disney.repositories.DisneyMovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisneyMovieService {

    private DisneyMovieRepository disneyMovieRepository;

    public DisneyMovieService(DisneyMovieRepository disneyMovieRepository) {
        this.disneyMovieRepository = disneyMovieRepository;
    }

    public List<DisneyMovieEntity> getAllMovies() {
        return disneyMovieRepository.findAll();
    }


}
