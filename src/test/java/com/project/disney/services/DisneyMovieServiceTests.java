package com.project.disney.services;

import com.project.disney.entities.DisneyMovieEntity;
import com.project.disney.repositories.DisneyMovieRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DisneyMovieServiceTests {

    @InjectMocks
    DisneyMovieService disneyMovieService;

    @Mock
    DisneyMovieRepository disneyMovieRepository;


    public DisneyMovieServiceTests() {
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getAllMoviesTest() {
        DisneyMovieEntity disneyMovieEntity = new DisneyMovieEntity();
        disneyMovieEntity.setMovieTitle("Test Movie");
        disneyMovieEntity.setGenre("Test");
        disneyMovieEntity.setMpaaRating("Test");
        disneyMovieEntity.setReleaseDate("25/03/2020");
        disneyMovieEntity.setTotalGross("test");
        when(disneyMovieRepository.findAll()).thenReturn(Arrays.asList(disneyMovieEntity));
        List<DisneyMovieEntity> disneyMovieEntities = disneyMovieService.getAllMovies();
        assertThat(disneyMovieEntities.size()).isEqualTo(1);
    }
}
