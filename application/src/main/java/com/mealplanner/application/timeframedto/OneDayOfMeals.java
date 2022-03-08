package com.mealplanner.application.timeframedto;

import java.util.List;

import com.mealplanner.application.mealdto.Meal;
import com.mealplanner.application.mealdto.NutritionalContent;

public class OneDayOfMeals {
	
	List<Meal> meals;
	
	NutritionalContent nutrients;
	
	
	
	public List<Meal> getMeals() {
		return meals;
	}
	
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}
	
	public NutritionalContent getNutrients() {
		return nutrients;
	}
	
	public void setNutrients(NutritionalContent nutrients) {
		this.nutrients = nutrients;
	}

}
