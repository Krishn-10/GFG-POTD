//Indexes of Subarray Sum
//9-01-2025
//Space Commplexity - O(n)
//Time Complexity - O(n*2)
//Approach - Brute Force


class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int left=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>target){
                sum=sum-arr[left];
                left=left+1;
            }
            if(sum==target){
                list.add(left+1);
                list.add(i+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    
    }
}
