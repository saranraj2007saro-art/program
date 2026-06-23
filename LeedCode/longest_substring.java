class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> l=new HashSet<>();
       int c=0;
       int i=0;
        
            for(char n:s.toCharArray()){
               
                while(l.contains(n)){
                   l.remove(s.charAt(i));
                   i++;

                }
                l.add(n);
                c=Math.max(c,l.size());
            }
                
       return c;

        
    }
}