import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    // int i=0,j=nums.length-1;
    // int a[]=new int[2];
    // while(i<j){
    //     if(nums[i]+nums[j]==target){
    //         return new int[]{i,j};
    //     }
    //     else if(nums[i]+nums[j]<target){
    //         i++;
    //     }else{
    //        j--;
    //     }
    // }
        
    //     return a;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];

            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};

    }
}