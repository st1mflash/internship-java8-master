package ru.liga.helloworld.domain;


import java.util.List;

public class Country {
    private final List<Region> regions;
    private final String name;

    public Country(String name, List<Region> regions) {
        this.regions = regions;
        this.name = name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public String getName() {
        return name;
    }

    /**
     * Есть ли в стране города с короткими названиями (3 и меньше букв)
     *
     * @return true - есть
     */
    public boolean hasCitiesWithThreeOrLessLetterName() {
        return regions.stream()
                .map(Region::getCities)
                .flatMap(List::stream)
                .anyMatch(c -> c.getName().length() <= 3);
    }

}






