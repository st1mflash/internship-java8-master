package ru.liga.oop.i;

import java.util.ArrayList;
import java.util.List;

public class AmazonAws implements CloudProvider {

    @Override
    public void storeFile(String fileName, byte[] file) {
        System.out.println("Сохраняю файл " + fileName);
    }

    @Override
    public byte[] getFile(String fileName) {
        System.out.println("Возвращаю файл " + fileName);
        return new byte[1024];
    }

    @Override
    public void deleteFile(String fileName) {
        System.out.println("Удаляю файл " + fileName);
    }

    @Override
    public void createServer(String region) {
        System.out.println("Создаю новый сервер в регионе " + region);
    }

    @Override
    public List<String> getServers(String region) {
        System.out.println("Возвращаю список серверов в регионе " + region);
        return new ArrayList<>();
    }

    @Override
    public boolean changeServerSpec(String serverId, List<String> spec) {
        System.out.println("Меняю настройки сервера " + serverId);
        return true;
    }
}