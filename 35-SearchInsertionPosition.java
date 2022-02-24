class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (target < nums[left] )
            return 0;
        else if (target > nums[right]) {
            return right + 1;
        }

        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target > nums[mid] &&  target < nums[mid+1])
                return mid +1;

            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}