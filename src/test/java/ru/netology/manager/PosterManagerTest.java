package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterMovies;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
  PosterMovies first = new PosterMovies(1, 561, "1url", "name1", "genre1");
  PosterMovies second = new PosterMovies(2,65, "2url", "name2", "genre2");
  PosterMovies third = new PosterMovies(3, 456, "3url", "name3", "genre3");
  PosterMovies fourth = new PosterMovies(4, 565461, "4url", "name4", "genre1");
  PosterMovies fifth = new PosterMovies(5,6588, "5url", "name5", "genre2");
  PosterMovies sixth = new PosterMovies(6, 4536, "6url", "name6", "genre3");
  PosterMovies seventh = new PosterMovies(7, 56651, "7url", "name7", "genre1");
  PosterMovies eighth = new PosterMovies(8,625, "8url", "name8", "genre2");
  PosterMovies ninth = new PosterMovies(9, 4596, "9url", "name9", "genre3");
  PosterMovies tenth = new PosterMovies(10, 56133, "10url", "name10", "genre1");
  PosterMovies eleventh = new PosterMovies(11,165, "11url", "name11", "genre2");
  PosterMovies twelfth = new PosterMovies(12, 4506, "12url", "name12", "genre3");
  @Test
  public void lastTen() {
    PosterManager manager = new PosterManager();
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);
    manager.add(eleventh);
    manager.add(twelfth);

    manager.getAll();

    PosterMovies[] actual = manager.getAll();
    PosterMovies[] expected = new PosterMovies[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
    assertArrayEquals(expected, actual);
  }
    @Test
    public void lastFive() {
      PosterManager manager = new PosterManager(5);
      manager.add(first);
      manager.add(second);
      manager.add(third);
      manager.add(fourth);
      manager.add(fifth);
      manager.add(sixth);
      manager.add(seventh);
      manager.add(eighth);
      manager.add(ninth);
      manager.add(tenth);
      manager.add(eleventh);
      manager.add(twelfth);

      manager.getAll();

      PosterMovies[] actual = manager.getAll();
      PosterMovies[] expected = new PosterMovies[]{twelfth,eleventh, tenth, ninth, eighth};
      assertArrayEquals(expected, actual);

  }
  @Test
  public void ifMoviesLessTen() {
    PosterManager manager = new PosterManager();
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);


    manager.getAll();

    PosterMovies[] actual = manager.getAll();
    PosterMovies[] expected = new PosterMovies[]{sixth, fifth, fourth, third, second, first};
    assertArrayEquals(expected, actual);
  }

}