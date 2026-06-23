class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s=new TreeSet<>();
        for(int n:nums){
            s.add(n);
        }
       ArrayList<Integer> l=new ArrayList<>(s);
        if(s.size()==1){
            return l.get(0);
        }
        else if(s.size()==2){
            return l.get(s.size()-1);
        }
        else{
            return l.get(s.size()-3);
        }

     //   System.out.print(s);
      //  return 0;
        
    }
}