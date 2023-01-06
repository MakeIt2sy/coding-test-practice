package Problem2;

public class Calculator {
	
	int value;
	
	public Calculator() {
		this.value = 0;
	}

	public Calculator add (int num) {
		this.value += num;
		
		return this;	
	}

	public Calculator substract (int num) {
		this.value -= num;
		
		return this;	
	}

	public int out() {
		
		return this.value;
	}


	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		int result = calculator.add(4).add(5).substract(3).out();
		System.out.println(result);

	}

}
