/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josia
 */
public class Film {

    private String name;
//    private ArrayList<Rating> ratings = new ArrayList<Rating>();

    public Film(String name) {
        this.name = name;
    }

//    public void addRating(Rating rating) {
//        ratings.add(rating);
//    }
//
//    public List<Rating> getRatings() {
//        return this.ratings;
//    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
}
