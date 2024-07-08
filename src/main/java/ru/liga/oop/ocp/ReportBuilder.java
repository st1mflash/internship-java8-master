package ru.liga.oop.ocp;

public class ReportBuilder {
    private ILogger logger;

    public ReportBuilder(ILogger logger) {
        this.logger = logger;
    }

    public String build() {
        String report = ""; //..логика отчета
        logger.log("Success!");
        return "";
    }
}