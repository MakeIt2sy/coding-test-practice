package Problem1;

import java.util.HashMap;
import java.util.Map;

public class ButterBread implements Bread {

	@Override
	public Map<String, Integer> getRecipe() {
		Map<String,Integer> recipe = new HashMap<>();
		
		recipe.put("flour", 100);
		recipe.put("water", 100);
		recipe.put("butter", 50);
		
		return recipe;
		
	}

	@Override
	public String getBreadType() {

		return "butter";
	}


}
