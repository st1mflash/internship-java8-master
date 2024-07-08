package ru.liga.optional;

import ru.liga.optional.domain.Passport;
import ru.liga.optional.repo.PassportRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Created by dzharkov on 10.03.2020.
 */

public class Task {

    private static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    private static PassportRepository repository = new PassportRepository();

    public static void main(String[] args) throws IOException {
        List<Passport> passports = repository.fetchAllPassports();
        printToConsoleIfConditionPass(passports,
                passport -> ChronoUnit.YEARS.between(passport.getDateOfBirth(), LocalDate.now()) >= 18);
    }


    private static void printToConsoleIfConditionPass(List<Passport> passports, Predicate<Passport> sellAlcoholCondition) {
        passports
                .stream()
                .filter(sellAlcoholCondition)
                .forEach(System.out::println);
    }


    private static Optional<Passport> findByName(List<Passport> passports, String fio) {
        //TODO: реализовать поиск по коллекции
        return null;
    }

    private static void printResult(Optional<Passport> passport) {
        //TODO: реализовать отображение результата
    }
}
