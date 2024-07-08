package ru.liga.optional.repo;

import ru.liga.optional.domain.Passport;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PassportRepository {

    public List<Passport> fetchAllPassports() {
        return Arrays.asList(
                new Passport("Круг Михаил Владимирович",     LocalDate.of(1962, 4, 7)),
                new Passport("Лещенко Лев Валерьянович",     LocalDate.of(1942, 2, 1)),
                new Passport("Моргенштерн Алишер Тагирович", LocalDate.of(2008, 2, 17))
        );
    }

}
