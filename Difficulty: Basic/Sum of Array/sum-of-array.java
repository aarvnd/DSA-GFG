class Solution {
    int arraySum(int arr[]) {
        int sum = 0;
        for(int x : arr) sum+= x;
        return sum;
    }
}
