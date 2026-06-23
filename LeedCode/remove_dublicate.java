class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
       ArrayList<Integer> l=new ArrayList<>(s);
    //   Collections.nCopies(nums.length,0);

    Collections.sort(l);

       for(int i=0;i<l.size();i++){
        nums[i]=l.get(i);
       }

       System.out.print(s);

       return s.size();




    }
}