class Solution {
    public boolean isPalindrome(String s) {
        boolean ans=true;
        String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0;
        int right=a.length()-1;
        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                ans=false;
                break;
            }
            left++;
            right--;
        }
        return ans;
    }
}
