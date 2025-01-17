// Longest substring with distinct characters
// 11-01-2025
//Space Comp - O(1)
//Time Comp - O(n*2)
//Approach - Brute Force

class Solution {
    public int longestUniqueSubstr(String s) {
        int ans = 1;
        int i=0;
        int j=0;
        while(i<s.length()){
            int currmax = 1;
            if(j==s.length())
                return ans;
            while(j<s.length()-1 && !((s.substring(i,j+1)).contains((String.valueOf(s.charAt(j+1)))))){
                j++;
                currmax++;
            }
            i++;
            j=i;
            ans = Math.max(currmax,ans);
        }
        return ans;
    }
}
