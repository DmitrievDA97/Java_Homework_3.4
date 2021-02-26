package ru.netology.domain;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class PosterMovies {
  private int id;
  private int idMovie;
  private String imageUrlMovie;
  private String nameMovie;
  private String genreMovie;
}
