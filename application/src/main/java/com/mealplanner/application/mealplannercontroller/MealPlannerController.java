package com.mealplanner.application.mealplannercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mealplanner.application.jsoneresponsedto.DayResponse;
import com.mealplanner.application.jsoneresponsedto.WeekResponse;
import com.mealplanner.application.mealplanningservices.SpoonacularQueryService;

@RestController
public class MealPlannerController {

	
	@Autowired
	public SpoonacularQueryService queryService;
	
	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getMealsForOneDay (@RequestParam(required = false)String numCalories,@RequestParam(required = false) String diet,@RequestParam(required = false) String exclusions) {
		
		return queryService.retrieveMealsForOneDayFromSpoonacularAPI(numCalories, diet, exclusions);
	}
	
	@GetMapping("mealplanner/week") 
	public ResponseEntity<WeekResponse> getWeekOfMeals (@RequestParam(required = false)String numCalories,@RequestParam(required = false) String diet,@RequestParam(required = false) String exclusions) {
		
		return queryService.retrieveWeekOfMealsFromSpoonacularAPI(numCalories, diet, exclusions);
		
	}
	
}
