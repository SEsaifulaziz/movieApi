package com.movieflix.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.lang.annotation.DeclareAnnotation;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Integer movieId;

    @NotBlank(message = "Please Provide movie's title!")
    private String title;

    @NotBlank(message = "Please Provide movie's director!")
    private String director;

    @NotBlank(message = "Please Provide movie's studio!")
    private String studio;

    private Set<String> movieCast; //collection of string

    private Integer releaseYear;

    @NotBlank(message = "Please provide movie's release year!")
    private String poster;

    @NotBlank(message = "Please provide poster's url!")
    private String posterUrl;
}
