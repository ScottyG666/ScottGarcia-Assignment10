package com.mealplanner.application.mealplanningservices;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.mealplanner.application.jsoneresponsedto.DayResponse;
import com.mealplanner.application.jsoneresponsedto.WeekResponse;

@Service
public class SpoonacularQueryService {
	
	@Autowired
	RestTemplate rt;

	
	public ResponseEntity<DayResponse> retrieveMealsForOneDayFromSpoonacularAPI (String numCalories, String diet, String exclusions) {
	
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", "day")
									  .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
									  .queryParamIfPresent("diet", Optional.ofNullable(diet))
									  .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
									  .queryParam("apiKey", "d660c9194d9144488d96555f81c2939d")
									  .build()
									  .toUri();
		
		if (numCalories != null && diet != null && exclusions != null) {
			
		}
		
		
		return rt.getForEntity(uri, DayResponse.class);
	}
	
	public ResponseEntity<WeekResponse> retrieveWeekOfMealsFromSpoonacularAPI (String numCalories, String diet, String exclusions) {
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				  .queryParam("timeFrame", "week")
				  .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
				  .queryParamIfPresent("diet", Optional.ofNullable(diet))
				  .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
				  .queryParam("apiKey", "d660c9194d9144488d96555f81c2939d")
				  .build()
				  .toUri();
		
		return rt.getForEntity(uri, WeekResponse.class);
	}
}
