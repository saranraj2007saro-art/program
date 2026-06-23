class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> l=new HashSet<>();

       for(int n:nums){
        if(l.contains(n)){
            return true;
        }
        l.add(n);
       }
       return false;
    }
}s