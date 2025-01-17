//Container With Most Water
//13-01-2025
//Space comp - O(1)
//Time comp - O(n)
//Approach - Two Pointer


class Solution {
    public int maxWater(int arr[]) {
        int i = 0;
        int j = arr.length-1;
        int maxwater = 0;
        while(i<j){
            int currwater = Math.min(arr[i],arr[j])*(j-i);
            maxwater = Math.max(currwater,maxwater);
            if(arr[i]<arr[j])
                i++;
            else
                j--;
        }
        return maxwater;
    }
}
