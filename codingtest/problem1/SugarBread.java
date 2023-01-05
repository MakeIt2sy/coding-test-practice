package Problem1;

import java.util.HashMap;
import java.util.Map;

public class SugarBread implements Bread {
	
		
	@Override
	public Map<String, Integer> getRecipe() {
		Map<String,Integer> recipe = new HashMap<>();
		
		recipe.put("flour", 100);
		recipe.put("water", 50);
		recipe.put("sugar", 200);
		
		return recipe;
		
	}
	
	@Override
	public String getBreadType() {

		return "sugar";
	}



}
