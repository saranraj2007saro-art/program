class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       // Set<Integer> s=new HashSet<>();
        List<Integer> s=new ArrayList<>();

        for(int i:nums){
            s.add(i);
        }
        int m=0;
        int c=0;
        for(int i=0;i<s.size();i++){
            if(s.get(i)==1){
                c+=1;
            }
            else{
                m=Math.max(c,m);
                c=0;

            }
        }

        return Math.max(c,m);

    }
}