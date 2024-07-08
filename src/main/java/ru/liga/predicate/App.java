package ru.liga.predicate;

import ru.liga.predicate.domain.Person;
import ru.liga.predicate.repo.PersonRepository;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

    private static PersonRepository repository = new PersonRepository();

    public static void main(String[] args) {
        Function<Boolean, String> translate = (flag) -> flag ? "Да" : "Нет";

        Consumer<Person> printConsumer = (person) -> {
            String result = "Person{" +
                    "fio='" + person.getFio() + '\'' +
                    ", dateOfBirth=" + person.getDateOfBirth() +
                    ", gender=" + person.getGender() +
                    ", isMarried=" + translate.apply(person.isMarried()) +
                    ", isStudent=" + translate.apply(person.isStudent()) +
                    ", hasJob=" + translate.apply(person.isHasJob()) +
                    '}';

            System.out.println(result);
        };

        List<Person> personList = repository.fetchAllPersons();

        Predicate<Person> isAdultAndNotMarried = (person) -> ChronoUnit.YEARS.between(person.getDateOfBirth(), LocalDate.now()) >= 18;

        Predicate<Person> isNotMarried = (person) -> !person.isMarried();

        Predicate<Person> commonPredicate = isAdultAndNotMarried.and(isNotMarried);

        List<Person> filteredPerson = filter(personList, commonPredicate);

        filteredPerson.forEach(printConsumer);
    }

    private static List<Person> filter(List<Person> personList, Predicate<Person> condition) {
        List<Person> result = new ArrayList<>();

        for (Person person : personList) {
            if (condition.test(person)) {
                result.add(person);
            }
        }

        return result;
    }
}
