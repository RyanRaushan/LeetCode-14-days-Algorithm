class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // for (int i = 0; i < arr.length; i++){
        //     for (int j = i+1; j < arr.length; j++){
        //         if (arr[i] + arr[j] == target){
        //             return new int[]{i+1, j+1};
        //         }
        //     }
        // }
        // return new int[]{-1, -1};
        
         int left = 0, right = numbers.length - 1;
        int[] result = new int[2];
        while (left < right) {
            int tmp = numbers[left] + numbers[right];
            if (tmp == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
            if (tmp > target) {
                right --;
            }
            else {
                left ++;
            }
        }
        return result;
    }
}