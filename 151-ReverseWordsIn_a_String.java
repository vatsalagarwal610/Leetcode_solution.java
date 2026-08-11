//Problem No.: 151
//Problem Name: Reverse Words in a String
//Difficulty: MEDIUM


//SOLUTION:-

class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int right = s.length() - 1;
        while (right >= 0) {
            while (right >= 0 && s.charAt(right) == ' ') {
                right--;
            }
            if (right < 0) break;

            int left = right;
            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(s.substring(left + 1, right + 1));

            right = left;
        }
        return result.toString();
    }
}


//Run Time: 4ms | 92.67%   
//Memory: 44.15 MB | 79.95%

