class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String r=new StringBuffer(words[i]).reverse().toString();
            if(r.equals(words[i])){
                return words[i];
            }
        }
        return "";
    }
}