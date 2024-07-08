package ru.liga.oop.i;

import java.util.List;

public interface CloudProvider {
    void storeFile(String fileName, byte[] file);

    byte[] getFile(String fileName);

    void deleteFile(String fileName);

    void createServer(String region);

    List<String> getServers(String region);

    boolean changeServerSpec(String serverId, List<String> spec);
}