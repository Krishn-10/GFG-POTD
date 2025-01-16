// Trapping Rain Water
// 12-01-2025
// Time comp - o(n)
// Space Comp - O(1)

class Solution {
    public int maxWater(int arr[]) {
      //to check the left maximum bar of for the current position of given array 
        int[] LMB = new int[arr.length];
      //to check the right maximum bar of for the current position of given array 
        int[] RMB = new int[arr.length];
        LMB[0] = arr[0];
        RMB[arr.length-1] = arr[arr.length-1];
      //Calculating left and right maximums
        for(int i=1;i<arr.length;i++){
            LMB[i] = Math.max(LMB[i-1],arr[i]);
        }
        for(int i=arr.length-2;i>=0;i--){
            RMB[i] = Math.max(RMB[i+1],arr[i]);
        }
        int maxwater = 0;
      //Calculation of max water
        for(int i=1;i<arr.length-1;i++){
            maxwater+=Math.min(LMB[i],RMB[i])-arr[i];
        }
        return maxwater;
    }
}
