```java

import java.util.HashMap;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        //1월 1일로부터 a월 b일까지의 일수를 계산해서 7로 나누고
        //나머지 0-금 1-토 .. 
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int pastDays = 0;
        
        HashMap<Integer,Integer> numberOfMonths = new HashMap<Integer,Integer>();
        numberOfMonths.put(1,31);
        numberOfMonths.put(2,29);
        numberOfMonths.put(3,31);
        numberOfMonths.put(4,30);
        numberOfMonths.put(5,31);
        numberOfMonths.put(6,30);
        numberOfMonths.put(7,31);
        numberOfMonths.put(8,31);
        numberOfMonths.put(9,30);
        numberOfMonths.put(10,31);
        numberOfMonths.put(11,30);
        numberOfMonths.put(12,31);
        
        //월로 지난 날 계산
        for(int i=1; i<=a-1; i++){
            if(a == 1){
                break;
            }
            pastDays += numberOfMonths.get(i);
        }
        
        pastDays += b-1; // 일수 계산
        
        answer = day[pastDays % 7]; 
        
        return answer;
    }
}

```
