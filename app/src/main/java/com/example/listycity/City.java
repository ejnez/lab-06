package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Checks if two different city and provinces are equal
     * @param o
     * Candidate object
     * @return city.equals(other.city) &amp;&amp; province.equals(other.province);
     * Checks if true
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return city.equals(other.city) &&
                province.equals(other.province);
    }

    /**
     * Returns hash of city and province
     * @return Objects.hash(city, province);
     * Returns hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}