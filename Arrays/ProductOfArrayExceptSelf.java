class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] p=new int[n];
        int[] s=new int[n];
        int left=1;
        int right=n-2;
        p[0]=1;
        s[n-1]=1;
        while(right>=0){
            p[left]=p[left-1]*nums[left-1];
            left++;
            s[right]=s[right+1]*nums[right+1];
            right--;
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=p[i]*s[i];
        }
        return result;
    }
}  
