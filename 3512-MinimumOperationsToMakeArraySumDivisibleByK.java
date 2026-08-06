//Problem No.: 3512 
//Problem Name: Minimum Operations to Make Array Sum Divisible by K
//Difficulty: EASY 


//SOLUTION:-

class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for(int num : nums){
            count += num;
        }
        return count % k;
    }
}


//Run Time: 1ms | 96.64%   
//Memory: 47.25 | 6.87%
