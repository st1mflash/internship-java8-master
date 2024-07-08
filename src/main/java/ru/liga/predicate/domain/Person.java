package ru.liga.predicate.domain;

import java.time.LocalDate;

public class Person {
    private String fio;
    private LocalDate dateOfBirth;
    private Gender gender;
    private boolean isMarried;
    private boolean isStudent;
    private boolean hasJob;

    public Person(String fio, LocalDate dateOfBirth, Gender gender, boolean isMarried, boolean isStudent, boolean hasJob) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isStudent = isStudent;
        this.hasJob = hasJob;
    }

    public String getFio() {
        return fio;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public boolean isHasJob() {
        return hasJob;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isStudent=" + isStudent +
                ", hasJob=" + hasJob +
                '}';
    }
}
