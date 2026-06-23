class Solution {
    public int removeElement(int[] nums, int val) {
        // int a[]=Arrays.stream(nums)
        //                 .filter(x->x!=val)
        //                 .toArray();
        // return a.length;

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val) {
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}