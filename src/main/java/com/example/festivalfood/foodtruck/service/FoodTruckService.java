package com.example.festivalfood.foodtruck.service;

import com.example.festivalfood.foodtruck.domain.FoodTruck;
import com.example.festivalfood.foodtruck.dto.FoodTruckNPlusOneResponse;
import com.example.festivalfood.foodtruck.repository.FoodTruckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodTruckService {

    private final FoodTruckRepository foodTruckRepository;

    @Transactional(readOnly = true)
    public List<FoodTruckNPlusOneResponse> getFoodTrucksWithNPlusOne() {
        List<FoodTruck> foodTrucks = foodTruckRepository.findAll();

        return foodTrucks.stream()
                .map(FoodTruckNPlusOneResponse::from)
                .toList();
    }
}