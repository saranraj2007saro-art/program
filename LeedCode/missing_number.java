class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int n:nums){
            l.add(n);
        }
       boolean b=true;
       Collections.sort(l);

       for(int i=0;i<l.size();i++){
        if(!l.contains(i)){
            return i;
        }
       }

       return l.get(l.size()-1)+1;
       

    }
}