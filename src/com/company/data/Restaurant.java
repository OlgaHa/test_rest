package com.company.data;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Restaurant implements EntityBase {

    public static final String SELECT_QUERY = "select * from " + Constants.SCHEMA_NAME + ".t_rest";
    private int id;
    private String name;
    private String city;
    private String address;
    private String district;
    private int freeTables;
    private int maxTables;

    public static String getSelectSql() {
        return SELECT_QUERY;
    }

    public static EntityBase getEntity(ResultSet rs) {
        return Restaurant.createRest(rs);
    }


    public static Restaurant createRest(ResultSet rs) {
        Restaurant rest = null;
        try {
            rest = new Restaurant(rs.getInt("id_rest"),
                    rs.getString("name_rest"),
                    rs.getString("city_rest"),
                    rs.getString("address_rest"),
                    rs.getString("district_rest"),
                    rs.getInt("free_tables_rest"),
                    rs.getInt("max_free_tables_rest"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rest;
    }

    public Restaurant(int id, String name, String city, String address, String district, int freeTables, int maxTables) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.district = district;
        this.freeTables = freeTables;
        this.maxTables = maxTables;
    }

    public int getMaxTables() {
        return maxTables;
    }

    public void setMaxTables(int maxTables) {
        this.maxTables = maxTables;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getFreeTables() {
        return freeTables;
    }

    public void setFreeTables(int freeTables) {
        this.freeTables = freeTables;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", freeTables=" + freeTables +
                ", maxTables=" + maxTables +
                '}';
    }

    public int changeFreeTableCount(int currentCount, int number) {
        return currentCount + number;
    }
}
