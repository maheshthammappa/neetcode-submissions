class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int maxCount = 1;

        for(int num : set) {
            int count = 1;

            if(set.contains(num-1)) {
                continue;
            }
            else {
                int current = num;

                while(set.contains(current+1)) {
                    current += 1;
                    count++;
                    maxCount = Math.max(count, maxCount);
                }
            }

        }

        return maxCount;
    }
}
