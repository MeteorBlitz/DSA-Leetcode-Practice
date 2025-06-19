// Last updated: 6/19/2025, 12:09:30 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Step 1: Create a HashMap to store number and index
        Map<Integer, Integer> map = new HashMap<>();

        // Step 2: Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // the value we need

            // Step 3: Check if the required value exists in map
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i }; // return both indices
            }

            // Step 4: Store the current number and its index
            map.put(nums[i], i);
        }

        return new int[] {}; // return empty if no pair found
    }
}
