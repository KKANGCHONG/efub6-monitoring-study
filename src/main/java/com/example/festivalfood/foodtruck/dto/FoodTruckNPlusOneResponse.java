package com.example.festivalfood.foodtruck.dto;

import com.example.festivalfood.foodtruck.domain.FoodTruck;

public record FoodTruckNPlusOneResponse(
        Long foodTruckId,
        String foodTruckName,
        int menuCount
) {
    public static FoodTruckNPlusOneResponse from(FoodTruck foodTruck) {
        return new FoodTruckNPlusOneResponse(
                foodTruck.getId(),
                foodTruck.getName(),
                foodTruck.getMenus().size()
        );
    }
}