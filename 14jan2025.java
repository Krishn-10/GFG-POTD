//Equilibrium Point
class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        int a = 0;
        int b = 0;
        for(int i=0;i<arr.length;i++){
            int j = arr.length-1-i;
            prefix[i] = a;
            suffix[j] = b;
            a += arr[i];
            b += arr[j];
        }
        for(int i=0;i<arr.length;i++){
            if(prefix[i]==suffix[i]){
                return i;
            }
        }
        return -1;
    }
}
