class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> compare = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (compare.contains(nums[i])) {
                return true;
            }
            compare.add(nums[i]);
        }
        return false;
    }
}