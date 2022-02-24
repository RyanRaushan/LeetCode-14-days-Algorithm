class Solution {
    // public void rotate(int[] nums, int k) {
    //     k %= nums.length;
    //     for (int i = 0; i < k; i++){
    //         int num = nums[nums.length - 1];
    //         for (int j = nums.length - 1; j > 0; j--){
    //             nums[j] = nums[j-1];
    //         }
    //         nums[0] = num;
    //     }  
    // }
  
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  private void reverse(int[] nums, int l, int r) {
    while (l < r)
      swap(nums, l++, r--);
  }

  private void swap(int[] nums, int l, int r) {
    final int temp = nums[l];
    nums[l] = nums[r];
    nums[r] = temp;
  }
}


