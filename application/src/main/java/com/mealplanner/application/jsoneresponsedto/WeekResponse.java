package com.mealplanner.application.jsoneresponsedto;

import com.mealplanner.application.timeframedto.WeekOfMeals;

	//This class is to map the resturned String response from the spoonacular API  week query into
		//a succinct Object
public class WeekResponse {

	WeekOfMeals week;

	public WeekOfMeals getWeek() {
		return week;
	}

	public void setWeek(WeekOfMeals week) {
		this.week = week;
	}
	
}
