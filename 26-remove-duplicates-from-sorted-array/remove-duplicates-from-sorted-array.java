class Solution {
    public int removeDuplicates(int[] nums) {
int firstindex=0;
int k=1;
int secondindex=1;
while(secondindex<nums.length)
{
    if(nums[secondindex]==nums[secondindex-1])
    {
    secondindex++;
    continue;
    }
    else
    {
    nums[firstindex+1]=nums[secondindex];
    firstindex++;
    k++;
    secondindex++;
    
    
    }
    

}
     return k; 
    }
}