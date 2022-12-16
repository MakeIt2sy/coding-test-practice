```java

class Solution {
    public String solution(String s) {
        /** 단어 글자수를 세고
        *   글자수/2 나머지가 홀수이면 글자수/2 하나만, 글자수/2가 짝수이면 글자수/2 -1, 글자수/2
        */
        String answer = "";
        int wordLength = s.length();

        if(wordLength % 2 == 1){
            answer = String.valueOf(s.charAt(wordLength/2));
        } else{
            answer = String.valueOf(s.charAt((wordLength/2)-1)) + String.valueOf(s.charAt(wordLength/2));
        }

        return answer;
    }
}
```

