
```JAVA

import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        // 1: 2,3  2,4 3,4 
        // 2: 3,4 이런식으로 더해보게 해야함 
        // 소수 판별은 어떻게 하지? 2에서 그 숫자 -1까지 나누기 진행해서 0으로 떨어지는 값이 없어야함
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    sum = nums[i]+nums[j]+nums[k];
                    if(primeNumberDiscrimination(sum) ==false){
                        answer++;
                    }
                }
                
            }
            
        }        

        return answer;
    }
    
    public boolean primeNumberDiscrimination(int sum){
        boolean result = false;
        
        for(int i=2; i<sum; i++){
            if((sum%i) == 0){
                result = true;
            }
            
        }
        return result;
    }
}

```
