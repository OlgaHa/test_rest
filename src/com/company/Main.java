package com.company;

import com.company.data.Constants;
import com.company.data.MySqlDataRepository;
import com.company.data.RestDataRepository;
import com.company.data.Restaurant;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        RestDataRepository repo = new MySqlDataRepository();

        //Get all restaurant list
        var rests = repo.getRestaurants();
        for (var rest : rests) {
            System.out.println(rest.getName() + " " + rest.getFreeTables() + " " + rest.getMaxTables());
        }

       //Update freetable count  (check in the base as well)
        var rest1 = rests.get(0);
        repo.updateFreeTableCount(rest1, -1);
        System.out.println(rest1);

        //Get restaurant by name (full or part)
        var rest2 = repo.getByName("Vinc");
        System.out.println(rest2);

//        get restaurant by district (full)
        var rests3 = repo.getByDistrict("Centra rajons");
        for (var rest : rests3) {
           System.out.println(rest.getName()+ " "+ rest.getFreeTables());
        }

        //Get restaurant by city
        var rests4 = repo.getByCity("Rīga");
        for (var rest : rests4) {
            System.out.println(rest.getName()+ " "+ rest.getFreeTables());
        }

        //Get restaurant by street name from the address line (full or part)
        var rests5 = repo.getByStreet("Eliz");
        for (var rest : rests5) {
            System.out.println(rest.getName()+ " "+ rest.getAddress() + " free tables: "+ rest.getFreeTables());
        }

    }
}
