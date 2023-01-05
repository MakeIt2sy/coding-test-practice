package Problem34;

import java.math.BigDecimal;

public class Calculator {
	
	
	public Calculator() {}
	
	public static int factorial (int number) {
		
		if(number == 1) {
			return 1;
		}else {
			return number*factorial(number-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int result = factorial(4);
		System.out.println(result);
		
		
		
		/** 
		 *  Problem4. factorial 함수는 입력값이 큰 경우 Stack Overflow가 발생한다. 이 경우 해결할 수 있는 방법은?
		 *  
		 *  : 재귀 호출 이후 추가적인 연산을 하지 않도록 하는 꼬리 재귀를 이용하여 해결할 수 있습니다.
		 *    다만 이 방식은 컴파일러가 지원하지 않는다면 일반 재귀처럼 동작하게 됩니다.  
		 * 
		 */

	}

}
