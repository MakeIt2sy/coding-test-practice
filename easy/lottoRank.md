https://school.programmers.co.kr/learn/courses/30/lessons/77484


```java

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //lottos에서 0의 개수를 구한다.
        //이중 포문으로 lottos와 win_nums가 일치하는 개수를 센다.
        //일치하는 개수 ~ 일치하는 개수+0의 개수에 따라 순위 결정
        int correct = 0;
        int zeroNum = 0;
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){ 
                zeroNum++;    
            }else{
                for(int j=0; j<win_nums.length; j++){
                    if(win_nums[j] == lottos[i]){ correct++;}
                }   
            }
        }
        
        int max = 7-(zeroNum + correct) ; 
        int min = 7-correct;
        if(max == 7){max=6;}
        if(min == 7){min=6;}
        
        int[] answer = {max,min};
        
        return answer;
    }
}

```
