package ru.liga.oop.ocp;

public class Main {
    public static void main(String[] args) {
        ReportBuilder reportBuilder = new ReportBuilder(new Logger());
        reportBuilder.build();
    }
}
