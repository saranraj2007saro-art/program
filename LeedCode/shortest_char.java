class Solution {
    public int[] shortestToChar(String s, char c) {

      int a[]=new int[s.length()];
      int p=-s.length();
     int n=s.length();
      for(int i=0;i<n;i++){
        if(s.charAt(i)==c){
            p=i;
        }
        a[i]=i-p;
      }

      p=n*2;

      for(int i=n-1;i>=0;i--){
        if(s.charAt(i)==c){
            p=i;
        }
        a[i]=Math.min(a[i],p-i);
      }
    
       return a;

    }
}