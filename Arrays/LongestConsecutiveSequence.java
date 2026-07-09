// done using HashSet
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int longest=0;
        for(int num : hs){
            if(!hs.contains(num-1)){
                int n=num;
                int length=1;
                while(hs.contains(num+1)){
                    num++;
                    length++;
                }

                longest=Math.max(length, longest);
            }
        }
        return longest;
    }
}
