package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This deletes a city from the list
     * @param city
     * This is the candidate city to delete
     */
    public void delete(City city) {
        cities.remove(city);
    }

    /**
     * This returns the number of cities in the list
     * @return cities.size()
     * This is the number of cities
     */
    public int countCities(){
        return cities.size();
    }

    /**
     * This checks of the list as a certain city
     * If it does it will delete the city
     * Else it will find the number of cities
     * @param city
     * This is the candidate city to check
     */
    public void hasCity(City city) {

        if (cities.contains(city)) {
            delete(city);
        }
        else {
            countCities();
            throw new IllegalArgumentException();
        }
    }


}
