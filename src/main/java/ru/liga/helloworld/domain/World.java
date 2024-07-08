package ru.liga.helloworld.domain;

import java.util.List;
import java.util.stream.Collectors;

public class World {
    private final List<Country> countries;

    public World(List<Country> countries) {
        this.countries = countries;
    }

    public List<City> getAllCitiesNamesWithoutWhitespacesMoreSixteenSymbolsSortedByName() {
        return countries.stream()
                .map(Country::getRegions)
                .flatMap(List::stream)
                .map(Region::getCities)
                .flatMap(List::stream)
                .filter(c -> c.getName().length() > 16)
                .filter(c -> !c.getName().contains(" "))
                .sorted((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()))
                .collect(Collectors.toList());
    }

    public List<Country> getCountries() {
        return countries;
    }


    public long threeOrLessLetterNameOfCityCountryCount() {

        return countries.stream()
                .filter(Country::hasCitiesWithThreeOrLessLetterName)
                .count();
    }


}
