class Solution {
    public int maximumCount(int[] nums) {
        
        int n=0;
        int p=0;

        for(int i:nums){
            if(i<0){
                n+=1;
            }
            if(0<i){
                p+=1;
            }
        }

        int m=Math.max(n,p);
        return m;
    }
}