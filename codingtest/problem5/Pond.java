package Problem5;

public class Pond {
	
	/** 
	 * 0은 땅, 1은 물로 표현되는 디지털 연못의 연못 물 깊이 총합 
	 */
	
	static int[][] pond(int[][]state){
		
		int count = 0; //+1한 횟수 카운트
		int checked = 0; //4면 체크
		
		int top,right,bottom,left,center;
		
		for(int i=1; i<state.length-1;i++) {
			for(int j=1; j<state[i].length-1; j++) {
			
				top = state[i-1][j];
				right = state[i][j+1];
				bottom = state[i+1][j];
				left = state[i][j-1];
				center = state[i][j];
				
				
				if(top >0 && top >= center) checked++;
				if(right >0 && right  >= center) checked++;
				if(bottom >0 && bottom >= center) checked++;
				if(left >0 && left >= center) checked++;
				
				
				if(checked == 4 ) {
					state[i][j] += 1; 
					count ++;
				}
				
				checked = 0;
				
			}
		}
		
		
		if(count == 0 ) {
			return state;
		}
			
		return pond(state);
	}
	
	
	
	public static void main(String[] args) {
		
		int[][] initial_state = 
			{
			  {0,0,0,0,0,0,0,0,0,0},
			  {0,0,0,0,1,0,0,0,0,0},
			  {0,0,0,1,1,1,0,0,0,0},
			  {0,1,1,1,1,1,1,0,0,0},
			  {0,1,1,1,1,1,1,1,1,0},
			  {0,1,1,1,1,1,1,1,1,0},
			  {0,0,1,1,1,1,1,1,0,0},
			  {0,0,0,1,1,1,1,0,0,0},
			  {0,0,0,0,1,0,0,0,0,0},
			  {0,0,0,0,0,0,0,0,0,0}		
			};
		
		
		int[][] result = pond(initial_state);
		
		int sum = 0;
		
		
		for(int[] arr : result) {
			for(int k : arr) {
				sum += k;
			}
			
		}
		
		System.out.println(sum);

	}

}
