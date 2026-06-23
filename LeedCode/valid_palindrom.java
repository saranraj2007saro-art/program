class Solution {
    public boolean isPalindrome(String s) {
        String k=s.replaceAll("[^a-zA-Z0-9]","").trim();
        String r=new StringBuilder(k).reverse().toString();
        System.out.print(r);
        if(k.equalsIgnoreCase(r)) return true;
        else return false;
    }
}