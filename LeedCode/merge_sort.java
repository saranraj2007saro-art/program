class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       List<Integer> l= new ArrayList<>();
   int i=0;
       for(int p:nums1){
        if(i++<m) {
        l.add(p);
        }
       } 
      i=0;
       for(int p:nums2){
        if(i++<n){
        l.add(p);
        }
       } 

       Collections.sort(l);
       System.out.print(l);

       for(int k=0;k<l.size();k++){
        nums1[k]=l.get(k);
       }
     
    }
}