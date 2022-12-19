https://school.programmers.co.kr/learn/courses/30/lessons/17681

```java
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // arr의 10진수를 모두 2진수로 변환한다. 
        // 그러면 01001,10100,11100,10010,01011
        //         11110,00001,10101,10001,11100
        // 모두 string으로 변환
        // arr1[i] 와 arr2[i]의 m번째 글자 모두에 1이 없으면 공백, 하나라도 있으면 "#" string 
        String[] answer = new String[n];
		String[] arr1mid = new String[n];
		String[] arr2mid = new String[n];

		for (int i = 0; i < arr1.length; i++) {
			String arr1midNum = Integer.toBinaryString(arr1[i]);
			if (arr1midNum.length() < n) {
				int diff = n - arr1midNum.length();
				for(int j = 1; j<=diff; j++) {
					arr1midNum = "0" + arr1midNum;
				}
				arr1mid[i] = arr1midNum;
			} else {
				arr1mid[i] = arr1midNum;
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			String arr2midNum = Integer.toBinaryString(arr2[i]);
			if (arr2midNum.length() < n) {
				int diff = n - arr2midNum.length();
				for(int j = 1; j<=diff; j++) {
					arr2midNum = "0" + arr2midNum;
				}
				arr2mid[i] = arr2midNum;
			} else {
				arr2mid[i] = arr2midNum;
			}
		}

		
		for(int i=0; i<arr1mid.length; i++) { System.out.println(arr2mid[i]); } 
		

		for (int i = 0; i < n; i++) {
			String eliment = "";
			
			 for(int j=0; j< n; j++){ 
				  if(arr1mid[i].charAt(j) == '0' && arr2mid[i].charAt(j)== '0'){ 
					  eliment += " ";
			      }else{ 
			    	  eliment += "#"; } 
			 }

			answer[i] = eliment;
		}

		return answer;
        
    }
}

```

여러모로 조잡하다. 
알고 보니 비트 연산을 쓰는 거였다고 한다.. 

** 비트연산자
- 비트 연산이란 2진수의 숫자열을 같은 자리끼리 &,|, ^, ~ 등의 비트 연산자로 연산하는 것을 말한다. 
- | : 비트 비교시 하나라도 1이 존재하면 1 리턴
- & : 비트 비교시 두 비트 모두 1인 경우에만 1 리턴
- ^ : 대응되는 비트가 서로 다르면 1 리턴
- ~ : 비트가 1이면 0으로 0이면 1로 반전시킴
- << / << : 지정한 수만큼 비트를 좌우로 이동시킴

-> 비트 연산을 사용한 풀이로 바꾸면

```java
  class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {    
     //arr1,arr2 안의 숫자들을 이진수로 변경하고 비트 연산(|)한다.
     //하나라도 1이 존재해서 1이된 것들은 '#'로 변경하고, 둘 다 0이어서 0이 된 것들은 ' '로 변경
     //자리수 채우지 못한 것들은 자리수만큼 공백 추가
     
      String[] answer = new String[n];
      
      for( int i= 0; i < n; i++){
        answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        answer[i] = answer[i].replace('1','#');
        answer[i] = answer[i].replace('0',' ');
        
        while (answer[i].length<n) {
          answer[i] = ' '+answer[i];
        }
      }

      return answer;
    }
  }
```

