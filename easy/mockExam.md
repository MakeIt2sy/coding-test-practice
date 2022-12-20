https://school.programmers.co.kr/learn/courses/30/lessons/42840

```java
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        // 세 사람의 정답 배열을 만듦
        // for문으로 answers와 맞는 개수를 count 
        // count 값을 비교해서 answer배열에 넣음
        
        int[] answer = {};
        
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];
        
        for(int i =0; i<answers.length; i++){
            if(student1[i%5] == answers[i]){
                count[0]++;
            }
            if(student2[i%8] == answers[i]){
                count[1]++;
            }
            if(student3[i%10] == answers[i]){
                count[2]++;
            }
        }
        
        
        int max = Math.max(Math.max(count[0],count[1]),count[2]);
        
        ArrayList<Integer> answerMid = new ArrayList<>();
        if(count[0] == max) {
            answerMid.add(1);
        }
        if(count[1] == max) {
            answerMid.add(2);
        }
        if(count[2] == max) {
            answerMid.add(3);
        }
        
        answer = new int[answerMid.size()];
        
        for(int i=0; i<answerMid.size(); i++){
            answer[i] = answerMid.get(i);
        }
        
        return answer;
    }
}
```
