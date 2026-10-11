class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int maxCount = 0;

        for(int num : set) {
            int count = 1;
            int current = num;

            if(set.contains(num-1)) {
                continue;
            }

            while(set.contains(current+1)) {
                current += 1;
                count++;
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}
