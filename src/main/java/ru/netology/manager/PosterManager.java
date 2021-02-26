package ru.netology.manager;

import ru.netology.domain.PosterMovies;

public class PosterManager {
  private PosterMovies[] movies = new PosterMovies[0];
  private int limitMoviesInPoster = 10;
  public PosterManager() {

  }

  public PosterManager(int limitMoviesInPoster) {
    this.limitMoviesInPoster = limitMoviesInPoster;
  }


  public void add(PosterMovies movie) {
    int length = this.movies.length + 1;
    PosterMovies[] tmp = new PosterMovies[length];
     for (int i = 0; i < this.movies.length; i++) {
       tmp[i] = this.movies[i];
    }
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = movie;
    this.movies = tmp;
  }

  public PosterMovies[] getAll() {
    PosterMovies[] result;
    if (movies.length > limitMoviesInPoster) {
    result = new PosterMovies[limitMoviesInPoster];
    }
    else { result = new PosterMovies[movies.length];
    }
    for (int i = 0; i < result.length; i++) {
      int index = movies.length - i - 1;
      result[i] = movies[index];
    }
    return result;
  }

}
