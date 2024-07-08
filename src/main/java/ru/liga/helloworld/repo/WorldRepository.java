package ru.liga.helloworld.repo;

import ru.liga.helloworld.domain.City;
import ru.liga.helloworld.domain.Country;
import ru.liga.helloworld.domain.Region;
import ru.liga.helloworld.domain.World;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorldRepository {

    private final String dbPath;

    public WorldRepository(String dbPath) {
        this.dbPath = dbPath;

    }

    public World helloWorld() {
        String url = "jdbc:sqlite:" + dbPath;
        try (Connection conn = DriverManager.getConnection(url)) {
            return new World(fetchAllCountries(conn));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Country> fetchAllCountries(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT id, name  FROM country";
        ResultSet rs = stmt.executeQuery(sql);
        List<Country> countries = new ArrayList<>();
        while (rs.next()) {
            long id = rs.getLong("id");
            String name = rs.getString("name");
            countries.add(new Country(name, fetchRegionsByCountryId(id, conn)));
        }

        return countries;
    }

    private List<Region> fetchRegionsByCountryId(long country_id, Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT id, name FROM region where country_id = " + country_id;
        ResultSet rs = stmt.executeQuery(sql);
        List<Region> regions = new ArrayList<>();
        while (rs.next()) {
            long id = rs.getLong("id");
            String name = rs.getString("name");
            regions.add(new Region(name, fetchCitiesByRegionId(id, conn)));
        }

        return regions;

    }

    private List<City> fetchCitiesByRegionId(long region_id, Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT id, name FROM city where region_id = " + region_id;
        ResultSet rs = stmt.executeQuery(sql);
        List<City> cities = new ArrayList<>();
        while (rs.next()) {
            String name = rs.getString("name");
            cities.add(new City(name));
        }

        return cities;

    }


}
