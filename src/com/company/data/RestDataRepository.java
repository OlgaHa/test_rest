package com.company.data;

import java.util.List;

public interface RestDataRepository {
    List<Restaurant> getRestaurants();

    List<Restaurant> getByStreet(String street);

    List<Restaurant> getByCity(String city);

    List<Restaurant> getByDistrict(String district);

    Restaurant getByName(String name);

    void updateFreeTableCount(Restaurant rest, int count);


}
