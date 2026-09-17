class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i=0;
        int j=nums.length-1;
        int resindex=nums.length-1;
        int result[]=new int[nums.length];
        while(i<=j)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
            {
           result[resindex] =nums[i]*nums[i];
            i++;
            }
            else
            {
            result[resindex]=nums[j]*nums[j];
            j--;
            }
            resindex--;
        }
        return result;

    }
}