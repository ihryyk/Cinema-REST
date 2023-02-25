package com.rest.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * Used to store information about movie.
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private Long id;
    private String originalName;
    private Timestamp releaseDate;
    private short availableAge;
    private List<MovieDescription> movieDescriptionList = new ArrayList<>();
    private boolean deleted;
    private InputStream poster;
    private String base64ImagePoster;
}
