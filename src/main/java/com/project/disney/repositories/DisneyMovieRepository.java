package com.project.disney.repositories;

import com.project.disney.entities.DisneyMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisneyMovieRepository extends JpaRepository<DisneyMovieEntity, Long> {
}
