package ru.liga.oop.i;


import java.util.List;

public class ICloud implements CloudProvider {
    @Override
    public void storeFile(String fileName, byte[] file) {
        System.out.println("Сохраняю файл" + fileName);
    }

    @Override
    public byte[] getFile(String fileName) {
        System.out.println("Возвращаю файл" + fileName);
        return new byte[1024];
    }

    @Override
    public void deleteFile(String fileName) {
        System.out.println("Удаляю файл" + fileName);
    }

    @Override
    public void createServer(String region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> getServers(String region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean changeServerSpec(String serverId, List<String> spec) {
        throw new UnsupportedOperationException();
    }
}