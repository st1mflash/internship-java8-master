package ru.liga.helloworld.domain;

import java.util.List;

public class Region {
    private final List<City> cities;
    private final String name;

    public Region(String name, List<City> cities) {
        this.cities = cities;
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public String getName() {
        return name;
    }
}
