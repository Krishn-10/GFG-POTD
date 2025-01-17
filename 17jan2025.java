//Product array puzzle
//17-01-2025
//Space Complexity - O(1)
//Time Complexity - O(n)
// Approach - Prefix Sum

class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int prearr[] = new int[n];
        int suffarr[] = new int[n];
        prearr[0] = arr[0];
        suffarr[n-1] = arr[n-1];
        for(int i = 1;i<n;i++){
            prearr[i] = prearr[i-1] * arr[i];
        }
        for(int i = n-2 ; i>=0;i--){
            suffarr[i] = suffarr[i+1]*arr[i];
        }
        int ans[] = new int[n];
        
        ans[0] = suffarr[1];
        ans[n-1] = prearr[n-2];
        
        for(int i = 1;i<n-1;i++){
            ans[i] = prearr[i-1] * suffarr[i+1];
        }
        return ans;
    }
}
