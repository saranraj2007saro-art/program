class Solution {
    public boolean isAnagram(String s, String t) {
       char c[]=t.toCharArray();
       Arrays.sort(c);
       char k[]=s.toCharArray();
       Arrays.sort(k);
       String p=new String(k);
        return p.equals(new String(c));
    }
}