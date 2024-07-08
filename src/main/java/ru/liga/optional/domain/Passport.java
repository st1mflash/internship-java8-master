package ru.liga.optional.domain;

import java.time.LocalDate;

public class Passport {
    private String fio;
    private LocalDate dateOfBirth;

    public Passport(String fio, LocalDate dateOfBirth) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFio() {
        return fio;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "fio='" + fio + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
