package ru.liga.annotation;

import java.math.BigDecimal;

public class Employee {
    private final String fio;
    private final BigDecimal salary;

    public Employee(String fio, BigDecimal salary) {
        this.fio = fio;
        this.salary = salary;
    }

    private void printEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return fio + " получает " + salary;
    }
}
