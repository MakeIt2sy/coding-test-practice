1. twoSum

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //array복사 한 거 하나 더 만들어서 
        //target에서 nums[i] 빼고 복사한 거에서 nums[i+1] 이상에서 그 값이 있는지 찾고
        //있으면 그거 return 하면 되지 않을까?
        int[] result = new int[2];
        int[] numsClone = nums.clone();
        int diff = 0;

        for(int i=0; i<nums.length; i++){
            diff = target - nums[i];

          
                for(int j=i+1; j<numsClone.length; j++){
                    if(numsClone[j]==diff){
                        result[0] = i;
                        result[1] = j;

                        return result;
                    }

                }
        }

        return result;
      
    }
    
}

```


첫 문제.. for문을 두 번 썼다는 점에서 좀 아쉽다.


