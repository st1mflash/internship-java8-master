package ru.liga.predicate.repo;

import ru.liga.predicate.domain.Gender;
import ru.liga.predicate.domain.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public List<Person> fetchAllPersons() {
        return Arrays.asList(
            new Person("Петровичева Екатерина Алексеевна", LocalDate.of(1991, 3, 12), Gender.FEMALE, true, false, true),
            new Person("Александров Антон Сергеевич", LocalDate.of(1999, 2, 25), Gender.MALE, false, true, true),
            new Person("Константинов Евгений Александрович", LocalDate.of(1983, 1, 14), Gender.MALE, true, false, false),
            new Person("Малахова Татьяна Петровна", LocalDate.of(2003, 7, 5), Gender.FEMALE, false, true, false),
            new Person("Мартиросян Гевонд Мкртичевич", LocalDate.of(1956, 7, 31), Gender.MALE, true, false, true),
            new Person("Пархоменко Полина Валерьевна", LocalDate.of(1984, 9, 29), Gender.FEMALE, false, false, false),
            new Person("Золотов Сергей Анатольевич", LocalDate.of(1993, 12, 18), Gender.MALE, true, false, true),
            new Person("Дневальный Алексей Анатольевич", LocalDate.of(2002, 11, 7), Gender.MALE, false, true, false),
            new Person("Памфилова Эмма Сергеевна", LocalDate.of(1995, 4, 1), Gender.FEMALE, false, false, true),
            new Person("Абрамова Алина Викторовна", LocalDate.of(1982, 2, 22), Gender.FEMALE, true, false, false)
        );
    }

}
