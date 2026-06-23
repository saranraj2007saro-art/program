class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> l=new HashSet<>();
        Set<Integer> r=new HashSet<>();

        for(int c:nums1){
            l.add(c);
        }
        for(int c:nums2){
            r.add(c);
        }

        List<Integer> ll=new ArrayList<>(l);
        //List<Integer> rr=new ArrayList<>(r)

        List<Integer> a=new ArrayList<>();

        for(int i=0;i<l.size();i++){
            if(r.contains(ll.get(i))){
                a.add(ll.get(i));
            }
        }

        int e[]=new int[a.size()];
        for(int i=0;i<e.length;i++){
            e[i]=a.get(i);
        }
        
        return e;
        
    }
}