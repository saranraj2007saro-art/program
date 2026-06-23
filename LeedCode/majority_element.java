class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int m=0;
      

        for(int i:nums){
            if(c==0){
                m=i;
            }
            if(m==i){
                c++;
            }
            else{
                c--;
            }
        }

        return m;
    }
}