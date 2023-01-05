package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BreadFactory breadFactory = new BreadFactory();
		
		List<Bread> breadList = new ArrayList<>();
		
		breadList.add(breadFactory.makingBread("cream"));
		breadList.add(breadFactory.makingBread("sugar"));
		breadList.add(breadFactory.makingBread("butter"));
		
		for(Bread bread : breadList) {
			System.out.println("breadType:" + bread.getBreadType());
			System.out.println("recipe");
			System.out.println("flour:"+bread.getRecipe().get("flour"));
			System.out.println("water:"+bread.getRecipe().get("water"));
			System.out.println("butter:"+bread.getRecipe().get(bread.getBreadType()));
			System.out.println();
			
		}

	}

}
