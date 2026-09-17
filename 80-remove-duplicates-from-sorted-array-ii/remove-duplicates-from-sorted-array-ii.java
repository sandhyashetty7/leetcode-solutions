class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int firstindex=0;
        int secondindex=1;
        while(secondindex<nums.length)
        {
            if(nums[secondindex]==nums[secondindex-1]){
            if(firstindex >= 1 && nums[firstindex] == nums[firstindex - 1])
            {
            secondindex++;
            }
             else
             {
             nums[firstindex+1]=nums[secondindex];
            firstindex++;
            secondindex++;
            k++;
             }
            }

            else
            {
            nums[firstindex+1]=nums[secondindex];
            firstindex++;
            secondindex++;
            k++; 
            }
        }
        return k;

        
    }
}