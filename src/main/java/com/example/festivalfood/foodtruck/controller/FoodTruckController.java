package com.example.festivalfood.foodtruck.controller;

import com.example.festivalfood.foodtruck.dto.FoodTruckNPlusOneResponse;
import com.example.festivalfood.foodtruck.service.FoodTruckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/food-trucks")
public class FoodTruckController {

    private final FoodTruckService foodTruckService;

    @GetMapping("/n-plus-one")
    public ResponseEntity<List<FoodTruckNPlusOneResponse>> getFoodTrucksWithNPlusOne() {
        return ResponseEntity.ok(foodTruckService.getFoodTrucksWithNPlusOne());
    }
}