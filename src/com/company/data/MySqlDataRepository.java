package com.company.data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlDataRepository implements RestDataRepository {

    private Connection connection;
    private static final String connectionString = "jdbc:mysql://localhost:3306/" + Constants.SCHEMA_NAME;
    private static final String connectionUser = "root";
    private static final String connectionPassword = "utkkfxrfNEW21";

    public MySqlDataRepository() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Restaurant> getRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM test_rest.t_rest");

            while (rs.next()) {
                Restaurant rest = new Restaurant(rs.getInt("id_rest"), rs.getString("name_rest"), rs.getString("city_rest"), rs.getString("address_rest"), rs.getString("district_rest"), rs.getInt("free_tables_rest"), rs.getInt("max_free_tables_rest"));
                restaurants.add(rest);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return restaurants;
    }


    @Override
    public List<Restaurant> getByStreet(String street) {
        List<Restaurant> restaurants = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(Restaurant.SELECT_QUERY + " where address_rest like '%" + street + "%'");
            while (rs.next()) {
                var rest = Restaurant.createRest(rs);
                restaurants.add(rest);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return restaurants;
    }


    @Override
    public List<Restaurant> getByCity(String city) {
        List<Restaurant> restaurants = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);
            PreparedStatement stmt = connection.prepareStatement(Restaurant.SELECT_QUERY + " where city_rest = ?");
            stmt.setString(1, city);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                var rest = Restaurant.createRest(rs);
                restaurants.add(rest);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return restaurants;
    }

    @Override
    public List<Restaurant> getByDistrict(String district) {
        List<Restaurant> restaurants = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);
            PreparedStatement stmt = connection.prepareStatement(Restaurant.SELECT_QUERY + " where district_rest = ?");
            stmt.setString(1, district);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                var rest = Restaurant.createRest(rs);
                restaurants.add(rest);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return restaurants;
    }

    @Override
    public Restaurant getByName(String name) {
        try {
            connection = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(Restaurant.SELECT_QUERY + " where name_rest like '%" + name + "%'");
            while (rs.next()) {
                return Restaurant.createRest(rs);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateFreeTableCount(Restaurant rest, int count) {

        try {
            connection = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);
            Statement stmt = connection.createStatement();

            stmt.executeUpdate( "update test_rest.t_rest set free_tables_rest = free_tables_rest + " + count + " where name_rest = " + "'" + rest.getName() + "'");

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
