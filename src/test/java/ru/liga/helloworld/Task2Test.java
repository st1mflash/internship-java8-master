package ru.liga.helloworld;

import org.junit.Test;
import ru.liga.helloworld.domain.World;
import ru.liga.helloworld.repo.WorldRepository;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {


    /**
     * Реализовать метод country.hasCitiesWithThreeOrLessLetterName()
     * Есть ли в стране города с короткими названиями (3 и меньше букв)
     */
    @Test
    public void hasCitiesWithThreeLetterNameTest() {
        File file = new File(
                getClass().getClassLoader().getResource("world.sqlite").getFile()
        );

        World world = new WorldRepository(file.getAbsolutePath()).helloWorld();
        assertThat(world.getCountries().get(0).hasCitiesWithThreeOrLessLetterName()).isTrue();
        assertThat(world.getCountries().get(2).hasCitiesWithThreeOrLessLetterName()).isFalse();
    }

    /**
     * Реализовать метод world.threeOrLessLetterNameOfCityCountryCount()
     * Сколько есть стран с короткими названиями городов (3 и меньше букв)
     */
    @Test
    public void countTest() {
        File file = new File(
                getClass().getClassLoader().getResource("world.sqlite").getFile()
        );

        World world = new WorldRepository(file.getAbsolutePath()).helloWorld();
        assertThat(world.threeOrLessLetterNameOfCityCountryCount()).isEqualTo(54);
    }

}