package Problem1;

public class BreadFactory {
	
	public Bread makingBread(String breadType) {
		
		Bread bread = null;
		
		if(breadType.equals("cream")){
			bread = new CreamBread();
		}
		if(breadType.equals("sugar")){
			bread = new SugarBread();
		}
		if(breadType.equals("butter")){
			bread = new ButterBread();
		}
		
		return bread;
	}

}
