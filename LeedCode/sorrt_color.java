class Solution {
    public void sortColors(int[] nums) {
       // Arrays.sort(nums);
       int r=0,w=0,b=0;
      // int a[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            r+=1;
        }
        else if(nums[i]==1){
            w+=1;
        }
        else{
            b+=1;
        }
       }
       
       Arrays.fill(nums,0);

       for(int i=r;i<nums.length;i++){
         
         if(i<w+r){
            nums[i]=1;
         }
         else{
            nums[i]=2;
         }

       }

    }
}