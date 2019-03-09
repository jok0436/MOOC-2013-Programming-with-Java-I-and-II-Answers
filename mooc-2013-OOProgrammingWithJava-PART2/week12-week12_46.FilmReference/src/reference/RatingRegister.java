/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author josia
 */
public class RatingRegister {

    private Map<Film, List<Rating>> allFilms = new HashMap<Film, List<Rating>>();
    private HashMap<Person, HashMap<Film, Rating>> peopleRatings = new HashMap<Person, HashMap<Film, Rating>>();

    public void addRating(Film film, Rating rating) {
        List<Rating> ratings = new ArrayList<Rating>();
        ratings.addAll(allFilms.getOrDefault(film, ratings));
        ratings.add(rating);
        allFilms.put(film, ratings);
    }

    public void addRating(Person person, Film film, Rating rating) {
        HashMap<Film, Rating> ratings;
        if (this.peopleRatings.containsKey(person)) {
            ratings = this.peopleRatings.get(person);
        } else {
            ratings = new HashMap<Film, Rating>();
        }
        ratings.put(film, rating);
        this.peopleRatings.put(person, ratings);
        this.addRating(film, rating);
    }

    public Rating getRating(Person person, Film film) {
        HashMap<Film, Rating> ratings = this.peopleRatings.get(person);
        if (ratings.containsKey(film)) {
            return ratings.get(film);
        } else {
            return Rating.NOT_WATCHED;
        }
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        Map<Film, Rating> ratings = this.peopleRatings.getOrDefault(person, new HashMap<Film, Rating>());
        return ratings;
    }

    public List<Person> reviewers() {
        List<Person> reviewersList = new ArrayList<Person>();
        reviewersList.addAll(this.peopleRatings.keySet());
        return reviewersList;
    }

    public List<Rating> getRatings(Film film) {
        return allFilms.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.allFilms;
    }
}
