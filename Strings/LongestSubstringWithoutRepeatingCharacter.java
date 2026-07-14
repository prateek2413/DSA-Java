//Sliding Window 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int left=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            char a=s.charAt(right);
            while(hs.contains(a)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(a);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
