class Solution {
    public int findPeakElement(int[] nums) {
        
        // List<Integer>l=new ArrayList<>();
        // for(int i:nums){
        //     l.add(i);
        // }
        // Arrays.sort(nums);
        // System.out.print(l.indexOf(nums[nums.length-1]));
        // return l.indexOf(nums[nums.length-1]);

        int i=0;
        int j=nums.length-1;

        while(i<j){
            
         int m=(i+j)/2;

         if(nums[m]<nums[m+1]){
            i=m+1;
          }else{
            j=m;
          }
        }
        return i;

    }
}