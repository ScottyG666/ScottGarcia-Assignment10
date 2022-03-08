package com.mealplanner.application.mealdto;

// contains the nutritional content for the entire day of meals generated
public class NutritionalContent {

	
	String calories;
	
	String protein;
	
	String fat;
	
	String carbohydrates;
	

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	public String getProtein() {
		return protein;
	}

	public void setProtein(String protein) {
		this.protein = protein;
	}

	public String getFat() {
		return fat;
	}

	public void setFat(String fat) {
		this.fat = fat;
	}

	public String getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(String carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
	

	@Override
	public String toString() {
		return "NutritionalContent [calories=" + calories + ", protein=" + protein + ", fat=" + fat + ", carbohydrates="
				+ carbohydrates + "]";
	}

 

}
