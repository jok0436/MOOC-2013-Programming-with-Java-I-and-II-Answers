/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author josia
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    public int getAverageRating(Film filmSearched) {
        int result = 0;
        int count = 0;
        List<Rating> filmsRatings = ratings.get(filmSearched);
        for (Rating rating : filmsRatings) {
            result += rating.getValue();
            count++;
        }
        return result / count;
    }

    @Override
    public int compare(Film o1, Film o2) {
        return this.getAverageRating(o2) - this.getAverageRating(o1);
    }

}
