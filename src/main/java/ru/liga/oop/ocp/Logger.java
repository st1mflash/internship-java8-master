package ru.liga.oop.ocp;

public class Logger implements ILogger {
    @Override
    public void log(String text) {
        System.out.println(text);
    }
}