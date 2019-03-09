/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author josia
 */
public class Reference {

    private RatingRegister register;
    private Map<Film, List<Rating>> ratings;
    private FilmComparator comparator;

    public Reference(RatingRegister register) {
        this.register = register;
        ratings = register.filmRatings();
        comparator = new FilmComparator(ratings);
    }

    public Film recommendFilm(Person person) {

        List<Film> films = new ArrayList<Film>();
        films.addAll(ratings.keySet());
        Collections.sort(films, comparator);
        if (films.isEmpty()) {
            return null;
        }
        if (!register.reviewers().contains(person)) {
            return films.get(0);
        }
        return this.recommendFilmWithSimilarReviewers(person);
    }

    public Film recommendFilmWithSimilarReviewers(Person person) {
        List<Film> unwatchedFilms = this.getUnwatchedFilms(person);
        List<Person> similarReviewers = this.getSimilarPeople(person);
        Collections.sort(unwatchedFilms, this.comparator);
        if (similarReviewers.isEmpty()) {
            return null;
        }
        for (Person similarReviewer : similarReviewers) {
            List<Film> similarReviewersFilms = new ArrayList<Film>();
            similarReviewersFilms.addAll(register.getPersonalRatings(similarReviewer).keySet());
            Collections.sort(similarReviewersFilms, comparator);
            List<Film> recommendedFilms = new ArrayList<Film>();
            for (Film unwatchedFilm : unwatchedFilms) {
                for (Film otherFilm : similarReviewersFilms) {
                    if (otherFilm.equals(unwatchedFilm) && register.getRating(similarReviewer, otherFilm).getValue() > 0) {
                        recommendedFilms.add(otherFilm);
                    }
                }
            }
            Collections.sort(recommendedFilms, comparator);
            if (!recommendedFilms.isEmpty()) {
                return recommendedFilms.get(0);
            }
        }
        return null;
    }

    public List<Person> getSimilarPeople(Person personCheck) {
        List<Person> similarPeople = new ArrayList<Person>();
        for (Person person : register.reviewers()) {
            if (person.equals(personCheck)) {

            } else {
                Map<Film, Rating> ratingsPersonCheck = register.getPersonalRatings(personCheck);
                Map<Film, Rating> ratingsPerson = register.getPersonalRatings(person);
                int similarity = 0;
                for (Film film1 : ratingsPersonCheck.keySet()) {
                    for (Film film2 : ratingsPerson.keySet()) {
                        if (film1.equals(film2)) {
                            similarity = ratingsPersonCheck.get(film1).getValue() * ratingsPerson.get(film2).getValue();
                        }
                    }
                }
                if (similarity > 0) {
                    similarPeople.add(person);
                }
            }
        }
        return similarPeople;
    }

    private List<Film> getUnwatchedFilms(Person person) {
        List<Film> allFilms = new ArrayList<Film>();
        allFilms.addAll(register.filmRatings().keySet());
        List<Film> watchedFilms = new ArrayList<Film>();
        watchedFilms.addAll(register.getPersonalRatings(person).keySet());
        allFilms.removeAll(watchedFilms);
        return allFilms;
    }
}
