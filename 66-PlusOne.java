//Problem No.: 66
//Problem Name: Plus One
//Difficulty: EASY 


//SOLUTION:-

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}


//Run Time: 0ms | 100%   
//Memory: 43.07 MB | 95.93%
